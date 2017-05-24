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
    //functions
    println("sum:  2 + 4 = " + sum(2,4))
    println("sum2: 3 + 4 = " + sum2(3,4))
    log("function with Unit returning type")
    log2("function with no returning type")
}