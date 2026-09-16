package com.strumenta.antlrkotlin.gradle.plugins

import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

/**
 * The target Kotlin API and Language version for all antlr-kotlin modules.
 */
val KOTLIN_VERSION = KotlinVersion.KOTLIN_2_4

/**
 * The target bytecode version for the JVM compilation of all antlr-kotlin modules.
 */
val JVM_VERSION = JvmTarget.JVM_1_8

/**
 * The target Java version corresponding to the target [JVM_VERSION].
 */
val JAVA_VERSION = when (JVM_VERSION) {
  JvmTarget.JVM_1_8 -> JavaVersion.VERSION_1_8
  JvmTarget.JVM_9 -> JavaVersion.VERSION_1_9
  JvmTarget.JVM_10 -> JavaVersion.VERSION_1_10
  JvmTarget.JVM_11 -> JavaVersion.VERSION_11
  JvmTarget.JVM_12 -> JavaVersion.VERSION_12
  JvmTarget.JVM_13 -> JavaVersion.VERSION_13
  JvmTarget.JVM_14 -> JavaVersion.VERSION_14
  JvmTarget.JVM_15 -> JavaVersion.VERSION_15
  JvmTarget.JVM_16 -> JavaVersion.VERSION_16
  JvmTarget.JVM_17 -> JavaVersion.VERSION_17
  JvmTarget.JVM_18 -> JavaVersion.VERSION_18
  JvmTarget.JVM_19 -> JavaVersion.VERSION_19
  JvmTarget.JVM_20 -> JavaVersion.VERSION_20
  JvmTarget.JVM_21 -> JavaVersion.VERSION_21
  JvmTarget.JVM_22 -> JavaVersion.VERSION_22
  JvmTarget.JVM_23 -> JavaVersion.VERSION_23
  JvmTarget.JVM_24 -> JavaVersion.VERSION_24
  JvmTarget.JVM_25 -> JavaVersion.VERSION_25
  JvmTarget.JVM_26 -> JavaVersion.VERSION_26
}
