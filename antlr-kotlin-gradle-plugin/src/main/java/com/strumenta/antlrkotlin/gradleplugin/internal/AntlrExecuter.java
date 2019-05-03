/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.strumenta.antlrkotlin.gradleplugin.internal;

import org.gradle.api.GradleException;
import org.gradle.internal.UncheckedException;
import org.gradle.internal.os.OperatingSystem;
import org.gradle.internal.reflect.JavaMethod;
import org.gradle.internal.reflect.NoSuchPropertyException;
import org.gradle.internal.reflect.PropertyMutator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class AntlrExecuter implements AntlrWorker {

    private static final Logger LOGGER = LoggerFactory.getLogger(AntlrExecuter.class);

    @Override
    public AntlrResult runAntlr(AntlrSpec spec) {
        AntlrTool antlrTool = new Antlr4Tool();
        if (antlrTool.available()) {
            LOGGER.info("Processing with ANTLR 4");
            return antlrTool.process(spec);
        }

        throw new IllegalStateException("No ANTLR 4 implementation available");
    }


    private abstract static class AntlrTool {
        /**
         * Utility method to create an instance of the Tool class.
         *
         * @throws ClassNotFoundException if class was not on the runtime classpath.
         */
        static Object loadTool(String className, String[] args) throws ClassNotFoundException {
            LOGGER.debug("Loading tool " + className);
            try {
                Class<?> toolClass = Class.forName(className); // ok to use caller classloader
                LOGGER.debug("Tool loaded " + className);
                if (args == null) {
                    return toolClass.newInstance();
                } else {
                    Constructor<?> constructor = toolClass.getConstructor(String[].class);
                    return constructor.newInstance(new Object[]{args});
                }
            } catch(ClassNotFoundException cnf){
                LOGGER.error("Tool not loaded " + cnf.getMessage());
                throw cnf;
            } catch (InvocationTargetException e) {
                LOGGER.error("Tool not loaded " + e.getMessage());
                throw new GradleException("Failed to load ANTLR", e.getCause());
            } catch (Exception e) {
                LOGGER.error("Tool not loaded " + e.getMessage());
                throw new GradleException("Failed to load ANTLR", e);
            }
        }

        public final AntlrResult process(AntlrSpec spec) {
            try {
                return doProcess(spec);
            } catch (ClassNotFoundException e) {
                //this shouldn't happen if you call check availability with #available first
                throw new GradleException("Cannot process antlr sources", e);
            }
        }

        public static String relativePath(File from, File to) {
            try {
                return org.apache.tools.ant.util.FileUtils.getRelativePath(from, to);
            } catch (Exception e) {
                throw UncheckedException.throwAsUncheckedException(e);
            }
        }

        /**
         * process used for antlr3/4
         */
        public AntlrResult doProcess(AntlrSpec spec) throws ClassNotFoundException {
            int numErrors = 0;
            if (spec.getInputDirectories().size() == 0) {
                // we have not root source folder information for the grammar files,
                // so we don't force relativeOutput as we can't calculate it.
                // This results in flat generated sources in the output directory
                numErrors += invoke(spec.asArgumentsWithFiles(), null);
            } else {
                boolean onWindows = OperatingSystem.current().isWindows();
                for (File inputDirectory : spec.getInputDirectories()) {
                    final List<String> arguments = spec.getArguments();
                    arguments.add("-Dlanguage=Kotlin");
                    arguments.add("-o");
                    arguments.add(spec.getOutputDirectory().getAbsolutePath());
                    for (File grammarFile : spec.getGrammarFiles()) {
                        String relativeGrammarFilePath = relativePath(inputDirectory, grammarFile);
                        if (onWindows) {
                            relativeGrammarFilePath = relativeGrammarFilePath.replace('/', File.separatorChar);
                        }
                        arguments.add(relativeGrammarFilePath);
                    }
                    numErrors += invoke(arguments, inputDirectory);
                }
            }
            return new AntlrResult(numErrors);
        }

        abstract int invoke(List<String> arguments, File inputDirectory) throws ClassNotFoundException;

        public abstract boolean available();

        protected static String[] toArray(List<String> strings) {
            return strings.toArray(new String[0]);
        }

    }

    static class Antlr4Tool extends AntlrTool {
        @Override
        int invoke(List<String> arguments, File inputDirectory) throws ClassNotFoundException {
            final Object backedObject = loadTool("org.antlr.v4.Tool", toArray(arguments));
            if (inputDirectory != null) {

                writeableField(backedObject.getClass(), "inputDirectory").setValue(backedObject, inputDirectory);
            }
            JavaMethod.of(backedObject, Void.class, "processGrammarsOnCommandLine").invoke(backedObject);
            return JavaMethod.of(backedObject, Integer.class, "getNumErrors").invoke(backedObject);
        }

        @Override
        public boolean available() {
            try {
                loadTool("org.antlr.v4.Tool", null);
            } catch (ClassNotFoundException cnf) {
                return false;
            }
            return true;
        }
    }

    /**
     * Locates the field with the given name as a writable property. Searches only public properties.
     *
     * @throws org.gradle.internal.reflect.NoSuchPropertyException when the given property does not exist.
     */
    private static PropertyMutator writeableField(Class<?> target, String fieldName) throws NoSuchPropertyException {
        Field field = findField(target, fieldName);
        if (field != null) {
            return new FieldBackedPropertyMutator(fieldName, field);
        }
        throw new NoSuchPropertyException(String.format("Could not find writeable field '%s' on class %s.", fieldName, target.getSimpleName()));
    }

    private static Field findField(Class<?> target, String fieldName) {
        Field[] fields = target.getFields();
        for (Field field : fields) {
            if (fieldName.equals(field.getName())) {
                return field;
            }
        }
        return null;
    }

    private static class FieldBackedPropertyMutator implements PropertyMutator {
        private final String name;
        private final Field field;

        FieldBackedPropertyMutator(String name, Field field) {
            this.name = name;
            this.field = field;
        }

        @Override
        public String toString() {
            return "field " + field.getDeclaringClass().getSimpleName() + "." + name;
        }

        public String getName() {
            return name;
        }

        public Class<?> getType() {
            return field.getType();
        }

        public void setValue(Object target, Object value) {
            try {
                field.set(target, value);
            } catch (IllegalAccessException e) {
                throw UncheckedException.throwAsUncheckedException(e);
            }
        }
    }


}
