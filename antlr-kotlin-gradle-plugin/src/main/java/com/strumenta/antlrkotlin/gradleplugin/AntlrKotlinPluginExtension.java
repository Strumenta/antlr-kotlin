/*
 * Copyright 2019 the original author or authors.
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

import org.antlr.v4.runtime.RuntimeMetaData;

public class AntlrKotlinPluginExtension {
    private String antlrKotlinVersion = AntlrKotlinPlugin.class.getPackage().getImplementationVersion();
    private String antlrVersion = RuntimeMetaData.VERSION;
    private String platform = "jvm";

    public String getAntlrKotlinVersion() {
        return antlrKotlinVersion;
    }

    public void setAntlrKotlinVersion(String antlrKotlinVersion) {
        this.antlrKotlinVersion = antlrKotlinVersion;
    }

    public String getAntlrVersion() {
        return antlrVersion;
    }

    public void setAntlrVersion(String antlrVersion) {
        this.antlrVersion = antlrVersion;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
