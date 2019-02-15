package com.kotlin.basic

import java.awt.Rectangle

/**
 * basic syntax
 *
 * @author  Ivan on 2017/5/24 16:59.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * Define a function to return the sum of two numbers.
 */
fun sum(n : Int, m : Int): Int {
    return n + m
}

/**
 * Another form of function definition with inferred return type
 */
fun sum2(n : Int, m : Int) = n + m

/**
 * Function returning no meaningful value
 */
fun log(msg : String): Unit {
    println(msg)
}

/**
 * Function with no return value
 */
fun log2(msg : String) {
    println(msg)
}

val PI = 3.1415926
val NULL = 0

fun main(args: Array<String>) {
    println("function definition: ")
    //functions
    println("sum:  2 + 4 = " + sum(2,4))
    println("sum2: 3 + 4 = " + sum2(3,4))
    log("function with Unit returning type")
    log2("function with no returning type")
    funDefineBelowMain()

    println("\nvariables definition: ")
    //local variables, Assign-once(read-only) variable
    val a : Int = 3
    val b = 4
    val c : Int
    c = 5
    println("a = $a")
    println("b = $b")
    println("c = $c")

    //global variables
    println("π = $PI")
    println("NULL = $NULL")

    //mutable variables
    var x : Int = 4
    var y = 5
    var z : Int
    z = 6
    println("x = $x")
    println("y = $y")
    println("z = $z")
    println()

    //string templates
    stringTemplates()

    //conditional expressions
    conditionalExpressions(3, 4)

    //nullable values and checking for null
    println("Using nullable values:")
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
    println()

    //type checks and automatic casts
    println("type checks and automatic casts:")
    println(getArgumentTypeAndLength(10))
    println(getArgumentTypeAndLength("kotlin"))
    println()

    //loop
    println("Loops:")
    loop()
    println()

    //use when expression
    println("\nwhen expression:")
    println(whenExpression(1))
    println(whenExpression(1.0))
    println(whenExpression(1.0f))
    println(whenExpression("kotlin"))
    println()

    //range usage
    println("range usage:")
    range()
    println()

    stream()

}

/**
 * Function definition below main() is correct, which is different from many other languages like C or Python.
 */
fun funDefineBelowMain(): Unit {
    println("function defined below main() is correct, which is different from C")
}

/**
 * In a string, variables followed after '$' will be replaced with its value. In another case, expressions surrounded with '{}' can be placed after '$'.
 */
fun stringTemplates() {
    println("string templates: ")
    var a = 1
    val str = "a is $a"
    a = 2
    val s = "${str.replace("is", "was")} , but now is $a"
    println(s)
    println()
}

/**
 * There is nothing different from Java when using 'if' and 'else' expression in most cases. So I'm not intent on writing these kind of demos.
 * The different usage is below.
 *
 * Notice: ?: does not exists in Kotlin
 */
fun conditionalExpressions(a : Int, b: Int) {
    println("conditional expressions: ")
    val c = if (a > b) a else b
    println("c = $c")
    println()
}

/**
 * A reference must be explicitly marked as nullable when null value is possible.
 */
fun parseInt1(str: String): Int? {
    try {
        return if(str == "") str.toInt() else null
    } catch (e : Exception) {
        return null
    }
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

/**
 * Using type checks and automatic casts
 */
fun getArgumentTypeAndLength(obj : Any) : String {
    return when (obj) {
        is Int -> //obj is cast to Int automatic
            "Integer: $obj"
        is String -> "String: ${obj.length}"
        else -> "Unknown"
    }
}

/**
 * Loop in kotlin is quite different from Java. Here are the examples below
 */
fun loop() {
    val list = listOf("Cupcake", "Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie")
    // for each loop
    for (element in list) {
        print("$element, ")
    }
    println()
    //the other form of for each loop
    for (index in list.indices) {
        print(list[index] + ", ")
    }
    println()

    //while loop, the same as Java
    var index = 0
    while (index < list.size) {
        print(list[index] + ", ")
        index ++
    }
}

/**
 * The when expression is similar to Java's switch, but it is more flexible than switch. See the usage below.
 */
fun whenExpression(arg: Any) : String {
    return when(arg) {
        1           -> "One"
        is Double   -> "Double"
        !is String  -> "not String"
        else        -> "Something else"
    }
}

/**
 * The Range is similar to Python's range function, but there are differences. See the usage below.
 */
fun range() {
    for (i in 1 .. 10) {
        print("$i, ")
    }
    println()
    for (i in 10 downTo 1) {
        print("$i, ")
    }
    println()
    for (i in 0 .. 30 step 3) {
        print("$i, ")
    }
    println()

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }
}

fun stream() {
    val list = listOf("Cupcake", "Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie")
    list.filter { it[0] > 'K' }
            .sortedBy { it }
            .map { it[0] }
            .forEach { print(it) }
}

@Suppress("UnnecessaryVariable")
fun createInstance() : Any{
    val rectangle = Rectangle(4, 3)
    return rectangle
}

interface RectanglePrpperties {
    val isSquare:Boolean
}

abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()

    abstract fun calculateArea(): Double
}