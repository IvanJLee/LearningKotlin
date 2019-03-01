package com.kotlin.classes

/**
 * data class
 *
 * @author  lijun on 2019-03-01 14:06.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * The primary constructor needs to have at least one parameter;
 * All primary constructor parameters need to be marked as val or var;
 * Data classes cannot be abstract, open, sealed or inner;
 * (before 1.1) Data classes may only implement interfaces.
 */
data class DataClass(val name: String, var age: Int) {

    /**
     * the compiler only uses the properties defined inside the primary constructor for the automatically generated functions.
     */
    val gender: Boolean = false
}

fun main() {
    val ivan = DataClass("Ivan", 20)
    println(ivan.equals(DataClass("John", 21)))
    println(ivan.toString())
    val john = ivan.copy(age = 23)
    println(john.toString())
    println(john.component2())

    val (name, age) = ivan
    println("$name, $age")
}