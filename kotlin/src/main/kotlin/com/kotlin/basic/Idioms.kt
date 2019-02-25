package com.kotlin.basic

import java.io.File
import java.lang.IllegalStateException
import java.lang.NumberFormatException
import java.time.Instant
import kotlin.random.Random

/**
 * Idioms
 *
 * @author  Ivan on 2019-02-22 19:54.
 * @version v0.1
 * @since   v1.0
 *
 */

//Data class
data class Customer(val name: String, val email: String, val address: String)

fun dataClass() {
    println("data class")
    //data class provides component1(), component2(), …, for all properties
    val customer = Customer("Bob", "bob@gmail.com", "America")
    println("${customer.name} live in ${customer.component3()}")
    val customer2 = customer.copy("Alice")
    println("${customer2.name}'s email is ${customer2.component2()}")
}

//Default value for function parameters
fun funDefaultValue(a: Int = 0, s: String = "dummy") {
    println("default value for function parameters:")
    println("a=$a, s=$s")
}

//Filtering list
fun fileterList() {
    println("filtering list:")
    val r1 = listOf("apple", "baby", "cat", "domain", "entertainment", "fragile").filter { i -> i.length > 5 }
    val r2 = listOf("apple", "baby", "cat", "domain", "entertainment", "fragile").filter { it.length > 5 }
    println("r1= $r1, r2= $r2")
}

//String Interpolation
fun stringInterpolation() {
    println("String interpolation")
    val name = "Ivan"
    println("name= $name")
}

//Instance check
fun instanceCheck(param: Any) {
    println("instance check")
    when(param) {
        is Int, is Long -> println("Int value $param")
        is Float -> println("Float value $param")
        is String, Char -> println("Charactor $param")
        else -> println("other value $param")
    }
}

//Traversing a map/list of pairs
fun traverseCollection() {
    println("Traversing a map/list of pairs:")
    val list = listOf<Int>(1, 2, 3, 4, 5)
    val set = setOf<String>("alpha", "beta", "pi")
    val map = mapOf<Int, String>(Pair(1, "Thor"), Pair(2, "Loki"), Pair(3, "Tony"), Pair(4, "Hulk"))
    for (i in list) print("$i ")
    for (i in set) print("$i ")
    for ((k, v) in map) print("$k -> $v")
}

//Using ranges
fun ranges() {
    for (i in 0..99) {}
    for (i in 0 until 99) {}
    for (i in 0..99 step 3) {}
    for (i in 99 downTo 0) {}
    val x = Instant.now().epochSecond % 10
    if (x !in 5L..10L) {}
}

//Read only list/map
fun readOnlyCollection() {
    println("read only collections: ")
    val list = listOf(1, 2, 3);
    println(list)

    val mutableList = mutableListOf(6, 7, 8, 9)
    mutableList.add(10)
    println(mutableList)

    val map = mapOf<Int, String>(Pair(1, "Thor"), Pair(2, "Loki"), Pair(3, "Tony"), Pair(4, "Hulk"))
    println(map)
}

//Accessing map
fun accessMap() {
    val map = mapOf<Char, String>(Pair('T', "Thor"), Pair('L', "Loki"), Pair('T', "Tony"), Pair('H', "Hulk"))
    println(map['T'])
}

//Lazy property
fun lazyProperty() {
    println("lazy property:")
    println("now: ${Instant.now()}")
    Thread.sleep(5000)
    val a: String by lazy { "${Instant.now()}" }
    println("a= $a")
}

//Extension functions
fun String.spaceToUnderline() {
    this.replace(' ', '_')
}

fun space2Underline() {
    var s = "A collection of random and frequently used idioms in Kotlin.";
    s.spaceToUnderline()
    println(s)
}

//Singleton
object Resource {
    var name = "Name"
}

fun nonNull() {
    var files = File(".").listFiles()
    //if not null
    val size = files?.size

    //if not null else
    val childSize = files?.size ?: 0

    //if null
    val firstFile = files ?: throw IllegalStateException("empty folder")

    //get first item of a possible collection
    val first = files.firstOrNull() ?: File(".")

    val file = File(".")
    //execute if not
    file.listFiles()?.let { println("children count ${files.size}") }

    //map nullable value if not null
    val parent = file.parent?.let { it } ?: "no parent"
    println(parent)
}

//return on when statement
fun returnWhen(param: Any) : Number {
    return when(param) {
        is Number -> param
        is String -> param.length
        else -> param.hashCode()
    }
}

//try-catch expression
fun tryCatch(value: String) {
    val v = try {
        value.toInt()
    } catch (e : NumberFormatException) {
        0
    }
    println(v)
}

fun ifExpression(param: Int) {
    val v = if (param == 1) {
        "one"
    } else if (param == 2) {
        "two"
    } else{
        "Other"
    }
    println(v)
}

fun main() {

    /**/

    //data class
    dataClass()

    //function default parameter
    funDefaultValue()
    funDefaultValue(1)
    funDefaultValue(3, "hi")

    //filtering list
    fileterList()

    //instance check
    instanceCheck(5f)
    instanceCheck('f')

    //collections
    readOnlyCollection()

    //lazy
    lazyProperty()

    //extension funtion
    space2Underline()

    /**/

    //null
    nonNull()

}