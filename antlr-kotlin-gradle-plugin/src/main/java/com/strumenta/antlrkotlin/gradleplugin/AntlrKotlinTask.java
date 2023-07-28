/*
 * Copyright 2010 the original author or authors.
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

package com.strumenta.antlrkotlin.gradleplugin;

import com.strumenta.antlrkotlin.gradleplugin.internal.*;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.FileCollection;
import org.gradle.api.file.FileTree;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.tasks.*;
import org.gradle.process.internal.worker.WorkerProcessFactory;
import org.gradle.util.GFileUtils;
import org.gradle.work.ChangeType;
import org.gradle.work.Incremental;
import org.gradle.work.InputChanges;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Generates parsers from Antlr grammars.
 */
@CacheableTask
public abstract class AntlrKotlinTask extends SourceTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(AntlrKotlinTask.class);

    private boolean trace;
    private boolean traceLexer;
    private boolean traceParser;
    private boolean traceTreeWalker;
    private List<String> arguments = new ArrayList<String>();

    private FileCollection antlrClasspath;

    private File outputDirectory;
    private String maxHeapSize;
    private String packageName;
    private SourceDirectorySet sourceDirectorySet;

    /**
     * Specifies that all rules call {@code traceIn}/{@code traceOut}.
     */
    @Input
    public boolean isTrace() {
        return trace;
    }

    public void setTrace(boolean trace) {
        this.trace = trace;
    }

    /**
     * Specifies that all lexer rules call {@code traceIn}/{@code traceOut}.
     */
    @Input
    public boolean isTraceLexer() {
        return traceLexer;
    }

    public void setTraceLexer(boolean traceLexer) {
        this.traceLexer = traceLexer;
    }

    /**
     * Specifies that all parser rules call {@code traceIn}/{@code traceOut}.
     */
    @Input
    public boolean isTraceParser() {
        return traceParser;
    }

    public void setTraceParser(boolean traceParser) {
        this.traceParser = traceParser;
    }

    /**
     * Specifies that all tree walker rules call {@code traceIn}/{@code traceOut}.
     */
    @Input
    public boolean isTraceTreeWalker() {
        return traceTreeWalker;
    }

    public void setTraceTreeWalker(boolean traceTreeWalker) {
        this.traceTreeWalker = traceTreeWalker;
    }

    /**
     * The maximum heap size for the forked antlr process (ex: '1g').
     */
    @Internal
    public String getMaxHeapSize() {
        return maxHeapSize;
    }

    public void setMaxHeapSize(String maxHeapSize) {
        this.maxHeapSize = maxHeapSize;
    }

    /**
     * The package name of the generated files.
     */
    @Internal
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setArguments(List<String> arguments) {
        if (arguments != null) {
            this.arguments = arguments;
        }
    }

    /**
     * List of command-line arguments passed to the antlr process
     *
     * @return The antlr command-line arguments
     */
    @Input
    public List<String> getArguments() {
        return arguments;
    }

    /**
     * Returns the directory to generate the parser source files into.
     *
     * @return The output directory.
     */
    @OutputDirectory
    public File getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Specifies the directory to generate the parser source files into.
     *
     * @param outputDirectory The output directory. Must not be null.
     */
    public void setOutputDirectory(File outputDirectory) {
        if (!outputDirectory.isAbsolute()) {
            outputDirectory = new File(getProject().getProjectDir(), outputDirectory.getPath());
        }
        this.outputDirectory = outputDirectory;
    }

    /**
     * Returns the classpath containing the Ant ANTLR task implementation.
     *
     * @return The Ant task implementation classpath.
     */
    @Classpath
    public FileCollection getAntlrClasspath() {
        return antlrClasspath;
    }

    /**
     * Specifies the classpath containing the Ant ANTLR task implementation.
     *
     * @param antlrClasspath The Ant task implementation classpath. Must not be null.
     */
    public void setAntlrClasspath(FileCollection antlrClasspath) {
        this.antlrClasspath = antlrClasspath;
    }

    @Inject
    protected WorkerProcessFactory getWorkerProcessBuilderFactory() {
        throw new UnsupportedOperationException();
    }

    @Incremental
    @InputFiles
    @PathSensitive(PathSensitivity.RELATIVE)
    public abstract ConfigurableFileCollection getSourceItems();

    @TaskAction
    public void execute(InputChanges inputs) {
        final Set<File> grammarFiles = new HashSet<File>();
        final Set<File> sourceFiles = getSource().getFiles();
        final AtomicBoolean cleanRebuild = new AtomicBoolean();
        if (inputs.isIncremental()) {
            inputs.getFileChanges(getSourceItems()).forEach(fileChange -> {
                if (fileChange.getChangeType() == ChangeType.MODIFIED) {
                    File input = fileChange.getFile();
                    if (sourceFiles.contains(input)) {
                        grammarFiles.add(input);
                    } else {
                        // classpath change?
                        cleanRebuild.set(true);
                    }
                } else if (fileChange.getChangeType() == ChangeType.REMOVED) {
                    cleanRebuild.set(true);
                }
            });
        } else {
            grammarFiles.addAll(getInputs().getSourceFiles().getFiles());
        }

        if (cleanRebuild.get()) {
            GFileUtils.deleteDirectory(outputDirectory);
            grammarFiles.addAll(sourceFiles);
        }

        AntlrWorkerManager manager = new AntlrWorkerManager();
        LOGGER.debug("AntlrWorkerManager created");
        AntlrSpec spec = new AntlrSpecFactory().create(this, grammarFiles, sourceDirectorySet);
        LOGGER.debug("AntlrSpec created");
        AntlrResult result = manager.runWorker(getProject().getProjectDir(), getWorkerProcessBuilderFactory(), getAntlrClasspath(), spec);
        LOGGER.debug("AntlrResult obtained");
        evaluate(result);
    }

    private void evaluate(AntlrResult result) {
        int errorCount = result.getErrorCount();
        if (errorCount < 0) {
            throw new AntlrSourceGenerationException("There were errors during grammar generation", result.getException());
        } else if (errorCount == 1) {
            throw new AntlrSourceGenerationException("There was 1 error during grammar generation", result.getException());
        } else if (errorCount > 1) {
            throw new AntlrSourceGenerationException("There were "
                    + errorCount
                    + " errors during grammar generation", result.getException());
        }
    }

    /**
     * Sets the source for this task. Delegates to {@link #setSource(Object)}.
     * <p>
     * If the source is of type {@link SourceDirectorySet}, then the relative path of each source grammar files
     * is used to determine the relative output path of the generated source
     * If the source is not of type {@link SourceDirectorySet}, then the generated source files end up
     * flattened in the specified output directory.
     *
     * @param source The source.
     * @since 4.0
     */
    @Override
    public void setSource(FileTree source) {
        setSource((Object) source);
    }

    /**
     * Sets the source for this task. Delegates to {@link SourceTask#setSource(Object)}.
     * <p>
     * If the source is of type {@link SourceDirectorySet}, then the relative path of each source grammar files
     * is used to determine the relative output path of the generated source
     * If the source is not of type {@link SourceDirectorySet}, then the generated source files end up
     * flattened in the specified output directory.
     *
     * @param source The source.
     */
    @Override
    public void setSource(Object source) {
        super.setSource(source);
        if (source instanceof SourceDirectorySet) {
            this.sourceDirectorySet = (SourceDirectorySet) source;
        }
    }

    /**
     * Returns the source for this task, after the include and exclude patterns have been applied. Ignores source files which do not exist.
     *
     * @return The source.
     */
    @Override
    @PathSensitive(PathSensitivity.RELATIVE)
    public FileTree getSource() {
        return super.getSource();
    }
}
