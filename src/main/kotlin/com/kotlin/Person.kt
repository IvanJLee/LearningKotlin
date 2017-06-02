package com.kotlin

/**
 * a person object
 *
 * @author  Ivan on 2017/6/2 10:39.
 * @version v0.1
 * @since   v1.0
 *
 */

/**
 * Only class decorated by the keyword open can be extended.
 */
open class Person constructor() {

    var givenName = "Unnamed"
    var familyName = "Smith"
    open var age = 0
    var weight = 0f

    constructor(name : String) : this() {
        this.givenName = name
    }

    constructor(age : Int) : this("Christopher") {
        this.age = age
    }

    constructor(weight : Float) : this("Benjamin") {
        this.weight = weight
    }

    init {
        println("I was init with $givenName at age $age")
    }

    open fun greet() {
        print("My name is $givenName $familyName. ")
        println("I am $age years old, wights $weight kg.")
    }

    open fun sayHello() {
        greet()
    }

}

fun main(args : Array<String>) {
    Person("Jack").greet()
    Person(20).greet()
    Person(60.0F).greet()
}