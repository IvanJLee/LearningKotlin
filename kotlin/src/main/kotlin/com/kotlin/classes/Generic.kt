package com.kotlin.classes

/**
 * Generics
 *
 * @author  Ivan on 2019-03-02 19:19.
 * @version v0.1
 * @since   v1.0
 *
 */

class Generic<T>(t: T) {
    val value = t
}

fun main() {
    val generic: Generic<Int> = Generic(1)
}