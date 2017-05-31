package com.kotlin

/**
 * basic syntax
 *
 * @author  Ivan on 2017/5/24 16:59.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * Define a function to return the sun of two numbers.
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
    val b = 3
    val c : Int
    c = 3
    println("a = " + a )
    println("b = " + b )
    println("c = " + c )

    //mutable variables
    var x : Int = 4
    var y = 5
    val z : Int
    z = 6
    println("x = " + x )
    println("y = " + y )
    println("z = " + z )
    println()

    //string templates
    stringTemplates()
    //conditional expressions
    conditionalExpressions(3, 4)
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
    print("c = $c")
    println()
}