package com.kotlin.basic

/**
 * <h2>Basic Types<h2>
 * In Kotlin, everything is an object in the sense that we can call member functions and properties
 * on any variable. Some of the types can have a special internal representation - for example,
 * numbers, characters and booleans can be represented as primitive values at runtime - but to the
 * user they look like ordinary classes. In this section we describe the basic types used in Kotlin:
 * numbers, characters, booleans, arrays, and strings.
 *
 * @author  Ivan on 2019-02-26 16:21.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * Numbers
 */

// Literial constants
@Suppress("UNUSED_VARIABLE")
fun literialConstants() {
    val d1: Double = 1.0
    val d2: Double = 1.0e3

    val f1: Float = 1f
    val f2: Float = 1F

    val l1: Long = 1
    val l2: Long = 1L

    val i1: Int = 1
    val i2: Int = 0x01
    val i3: Int = 0b0001

    val s: Short = 1

    val b: Byte = 1
}

// Underscores in numeric literals (since 1.1)
@Suppress("UNUSED_VARIABLE")
fun underscores() {
    val million = 1_000_000
    val cardId = 1234_5678_9012_345
    val hexBytes = 0xFF_EC_DE_A0
    val bytes = 0b1011_1000_0011
}

//On the Java platform, numbers are physically stored as JVM primitive types, unless we need a nullable number reference (e.g. Int?) or generics are involved
@Suppress("DEPRECATED_IDENTITY_EQUALS", "IMPLICIT_BOXING_IN_IDENTITY_EQUALS")
fun primitive() {
    val a: Int = 128
    println(a == a)
    val primitiveA: Int = a
    println(a === primitiveA) // true
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === primitiveA)// false due to different type
    println(boxedA === anotherBoxedA)// false due to different reference

    println()

    val b: Int = 127
    println(b == b)
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b
    println(boxedB === anotherBoxedB)
}

fun primitive2() {
    val a: Int = 128
    println(a == a)
    val primitiveA: Int = a
    println(a == primitiveA) // true
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA == primitiveA)// true, == compares values only
    println(boxedA == anotherBoxedA)// true

    println()

    val b: Int = 127
    println(b == b)
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b
    println(boxedB == anotherBoxedB)
}

fun main() {

    primitive2()
}