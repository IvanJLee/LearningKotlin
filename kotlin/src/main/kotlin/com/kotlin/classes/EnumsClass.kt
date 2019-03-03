package com.kotlin.classes

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

/**
 * Enum Classes
 *
 * @author  Ivan on 2019-03-03 23:44.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * The most basic usage
 */
enum class Direction {
    EAST, SOUTH, WEST, NORTH
}

/**
 * Since each enum is an instance of the enum class, they can be initialized as:
 */
enum class Color(val color: Int) {
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff)
}

/**
 * Anonymous Classes
 */
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

/**
 * Implementing Interfaces in Enum Classes
 */
enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

fun main() {
    printAllValues<RGB>()
}
