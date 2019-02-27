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

// Explicit Conversions
fun explicitConversions() {
//    val i: Int = 1
//    val l: Long = i
//    println(l == i) //compile error

    val b: Byte = 1
//    val i: Int = b //compile error
    val i: Int = b.toInt() // OK: explicitly widened
    println(i)

    val l: Long = 1L + 2 // OK widened to long
}

// Operations
fun operation() {
    var x = 1
    x = x shl 2 // 4
    println(x)

    x = x shr 2 // 1
    println(x)

    x = x and 0xff // 1
    println(x)
}

// Floating Point Numbers Comparison
fun floatCompare() {
    val f: Float = Float.NaN
    println("f : $f")
    println("f == NaN: ${f == Float.NaN}")
    println("NaN == NaN: ${Float.NaN == Float.NaN}")

    println("NaN < POSITIVE_INFINITY: ${Float.NaN < Float.POSITIVE_INFINITY}")
    println("NaN == POSITIVE_INFINITY: ${Float.NaN == Float.POSITIVE_INFINITY}")
    println("NaN > POSITIVE_INFINITY: ${Float.NaN > Float.POSITIVE_INFINITY}")
    val nz: Float = -0.0f
    val pz: Float = 0.0f
    println("-0.0f < 0.0f: ${nz < pz}")
    println("-0.0f == 0.0f: ${nz == pz}")
}

// Characters
fun charaters() {
    val c: Char = 'A'
//    println(c == 65) // compile error, Char is not treated as numbers
    if (c !in 'a'..'z') {
        println("not lower case characters")
    }

    //to ASCII
    println(c.toInt())
}

// Booleans
fun booleans() {
    var b1: Boolean = true
    var b2 = false

    println(b1 && b2)
    println(b1 and b2)
    println(b1.or(b2))
    println(b1.toString())
}

// Arrays
fun arrays() {
    val array = arrayOf(1, 2, 3, 4)
    println("${array}") // print array.toString
    array.forEach { println(it) }
    println()

    val fa = floatArrayOf(1f, 3f, 5f)
    fa.forEach { println(it) }
    println()

    val asc = Array(5, { i -> i * i })
    asc.forEach { println(it) }
}

// Unsigned numbers
@ExperimentalUnsignedTypes
fun unsignedNumbers() {
    val a: UInt = UInt.MAX_VALUE;
    println(a)

    val b: UByte = 1u

    val x = 42u
    val y = 0xff_ffu
}

// Strings
fun strings() {
    var s = "abcdef"+1+2+3
    for (c in s) {
        println(c)
    }
    println()

    //traverse with forEach
    s.forEach { c -> println(c) }

    // no escaped strings
    s = """
        var s = "abcdef"+1+2+3
        for (c in s) {
            println(c)
        }
    """
    println("\nno escaped strings:")
    println(s)
    println("\ntrimIndent:\n")
    println(s.trimIndent())
    println("\ntrimMargin:\n")
    println(s.trimMargin())
}

fun main() {

//    operation()

//    floatCompare()

//    charaters()

//    booleans()

//    arrays()

//    unsignedNumbers()

//    strings()
}