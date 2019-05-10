package com.strumenta.antlrkotlin.gradleplugin.internal;

import org.gradle.api.file.SourceDirectorySet;

public interface SourceDirectorySetFactory {
    SourceDirectorySet create(String name);
}
