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

import com.strumenta.antlrkotlin.gradleplugin.internal.AntlrSourceVirtualDirectoryImpl;
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.internal.plugins.DslObject;
import org.gradle.api.internal.tasks.DefaultSourceSet;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginConvention;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

import static org.gradle.api.plugins.JavaPlugin.IMPLEMENTATION_CONFIGURATION_NAME;

/**
 * A plugin for adding support for the ANTLR Kotlin target to {@link JavaPlugin java projects}.
 */
public class AntlrKotlinPlugin implements Plugin<Project> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AntlrKotlinPlugin.class);

    private static final String ANTLR_CONFIGURATION_NAME = "antlr-kotlin";

    public void apply(final Project project) {
        project.getPluginManager().apply(JavaPlugin.class);
        setupClasspath(project);
        setupTask(project);
    }

    private void setupClasspath(final Project project) {
        AntlrKotlinPluginExtension extension = project.getExtensions()
                .create("AntlrKotlinPluginExtension", AntlrKotlinPluginExtension.class);

        // set up a configuration named 'antlr' for the user to specify the antlr libs to use in case
        // they want a specific version etc.
        final Configuration antlrConfiguration = project.getConfigurations().create(ANTLR_CONFIGURATION_NAME)
                .setVisible(false)
                .setDescription("The Antlr libraries to be used for this project.");

        antlrConfiguration.defaultDependencies(defaultDependencies -> {
            DependencyHandler projectDependencies = project.getDependencies();
            String antlrKotlinVersion = extension.getAntlrKotlinVersion();
            String antlrVersion = extension.getAntlrVersion();
            String platform = extension.getPlatform();

            LOGGER.info("using antlr4 version {}", antlrVersion);
            defaultDependencies.add(projectDependencies
                    .create("org.antlr:antlr4:" + antlrVersion));

            LOGGER.info("using antlr-kotlin-target version {}", antlrKotlinVersion);
            defaultDependencies.add(projectDependencies
                    .create("com.strumenta.antlr-kotlin:antlr-kotlin-target:" + antlrKotlinVersion));

            LOGGER.info("using antlr-kotlin-runtime-{} version {}", platform, antlrKotlinVersion);
            defaultDependencies.add(projectDependencies
                    .create("com.strumenta.antlr-kotlin:antlr-kotlin-runtime-" + platform + ":" + antlrKotlinVersion));
        });

        project.getConfigurations().getByName(IMPLEMENTATION_CONFIGURATION_NAME).extendsFrom(antlrConfiguration);
    }

    private void setupTask(final Project project) {
        // Wire the antlr configuration into all antlr tasks
        project.getTasks().withType(AntlrKotlinTask.class, antlrTask -> antlrTask.getConventionMapping().map("antlrClasspath", () -> {
            Object result = project.getConfigurations().getByName(ANTLR_CONFIGURATION_NAME);
            LOGGER.debug("setting antlrClasspath to " + result);
            return result;
        }));

        //noinspection UnstableApiUsage
        final ObjectFactory objectFactory = project.getObjects();

        project.getConvention().getPlugin(JavaPluginConvention.class).getSourceSets().forEach(
                sourceSet -> {
                    // for each source set we will:
                    // 1) Add a new 'antlr' virtual directory mapping
                    String displayName = ((DefaultSourceSet) sourceSet).getDisplayName();
                    SourceDirectorySet sourceDirectorySet = objectFactory.sourceDirectorySet(
                            displayName + "-antlr-source",
                            displayName + " Antlr source");
                    final AntlrSourceVirtualDirectoryImpl antlrDirectoryDelegate
                            = new AntlrSourceVirtualDirectoryImpl(sourceDirectorySet);
                    new DslObject(sourceSet).getConvention().getPlugins().put(
                            AntlrSourceVirtualDirectory.NAME, antlrDirectoryDelegate);
                    final String srcDir = "src/" + sourceSet.getName() + "/antlr";
                    antlrDirectoryDelegate.getAntlr().srcDir(srcDir);
                    sourceSet.getAllSource().source(antlrDirectoryDelegate.getAntlr());

                    // 2) create an AntlrKotlinTask for this sourceSet following the gradle
                    //    naming conventions via call to sourceSet.getTaskName()
                    final String taskName = sourceSet.getTaskName("generateKotlin", "GrammarSource");
                    AntlrKotlinTask antlrTask = project.getTasks().create(taskName, AntlrKotlinTask.class);
                    antlrTask.setDescription("Processes the " + sourceSet.getName() + " Antlr grammars.");

                    // 3) set up convention mapping for default sources (allows user to not have to specify)
                    antlrTask.setSource(antlrDirectoryDelegate.getAntlr());

                    // 4) Set up the Antlr output directory (adding to javac inputs!)
                    final String outputDirectoryName = project.getBuildDir() + "/generated-src/antlr/" + sourceSet.getName();
                    final File outputDirectory = new File(outputDirectoryName);
                    antlrTask.setOutputDirectory(outputDirectory);
                    sourceSet.getJava().srcDir(outputDirectory);

                    // 6) register fact that antlr should be run before compiling
                    // compileKotlin is not available in the newer Multiplatform Kotlin plugins.
                    // Also, that error message gave me serious headaches figuring it out. ~Greg
                    Task buildTask = project.getTasks().findByName("build");
                    if (buildTask == null) {
                        String message = "Error configuring " + ANTLR_CONFIGURATION_NAME + " plugin: build task not found!";
                        LOGGER.error(message);
                        throw new GradleException(message);
                    }
                    buildTask.dependsOn(taskName);
                });
    }
}
