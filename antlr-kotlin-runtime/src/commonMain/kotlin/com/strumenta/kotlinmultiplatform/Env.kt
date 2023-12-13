package com.strumenta.kotlinmultiplatform

/**
 * Gets the value of the specified environment variable.
 *
 * An environment variable is a system-dependent external named value.
 *
 * @param name The name of the environment variable
 * @return The string value of the variable, or `null`
 *   if the variable is not defined in the system environment
 *
 * @author Edoardo Luppi
 */
internal expect fun platformGetEnv(name: String): String?
