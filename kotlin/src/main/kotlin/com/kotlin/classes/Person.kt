package com.kotlin.classes

import com.kotlin.properties.Inject

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
 *
 * A class in Kotlin can have a primary constructor and one or more secondary constructors.
 * The primary constructor is part of the class header: it goes after the class name (and optional
 * type parameters).
 */
open class Person constructor() {

    var givenName = "Unnamed"
    var familyName = "Smith"
    open var age = 0
    var weight = 0f

    /**
     * secondary constructor
     *
     * secondary constructor needs to delegate to the primary constructor since this class has a
     * primary constructor.
     */
    constructor(name : String) : this() {
        this.givenName = name
    }

    constructor(age : Int) : this("Christopher") {
        this.age = age
    }

    constructor(weight : Float) : this("Benjamin") {
        this.weight = weight
    }

    /**
     * The primary constructor cannot contain any code. Initialization code can be placed in
     * initializer blocks, which are prefixed with the init keyword.
     *
     * Note that code in initializer blocks effectively becomes part of the primary constructor.
     * Delegation to the primary constructor happens as the first statement of a secondary
     * constructor, so the code in all initializer blocks is executed before the secondary
     * constructor body. Even if the class has no primary constructor, the delegation still
     * happens implicitly, and the initializer blocks are still executed:
     */
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

/**
 * During an instance initialization, the initializer blocks are executed in the same order as they
 * appear in the class body, interleaved with the property initializers:
 */
class Biosphere(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

/**
 * If the primary constructor does not have any annotations or visibility modifiers, the constructor
 * keyword can be omitted:
 */
open class Animal(species: String) {

    /**
     * Parameters of the primary constructor can be used in property initializers declared in the
     * class body:
     */
    val s = species[0]

    open val x: Int = 1

    /**
     * Parameters of the primary constructor can also be used in the initializer blocks.
     */
    init {
        val s = species.toUpperCase()
    }
}

/**
 * for declaring properties and initializing them from the primary constructor, Kotlin has a concise
 * syntax:
 */
class Plant(val species: String, var age: Int) {} // the properties declared in the primary
// constructor can be mutable (var) or read-only (val).

/**
 * If the constructor has annotations or visibility modifiers, the constructor keyword is required,
 * and the modifiers go before it:
 */
class Microorganism public @Inject constructor(species: String) {

    /**
     * If you do not want your class to have a public constructor, you need to declare an empty primary
     * constructor with non-default visibility
     */
    private constructor() :this("") {}
}

class Dog: Animal(species = "Dog") {
    /**
     * override properties
     * the property must have a compatible type.
     * val property can be overrided to var
     * open property can be overided to final
     */
     final override var x: Int = 2
}

open class Parent() {

    init {
        println("Initializing Parent")
    }

    open val name: String = "Parent".also { println("Initializing name in Parent") }
    open val x: Int get() = 30

    open fun f() {
        println("f() in parent")
    }
}

class Child : Parent() {

    /**
     * child init happens after parent, so as property
     */
    init {
        println("Initializing Child")
    }

    override val name: String = "Child".also { println("Initializing name in Child") }
    override val x: Int = super.x + 1

    /*
     * call function in parent
     */
    override fun f() {
        super.f()
        println("f() in Child")
    }

    inner class Son public constructor() {
        fun g() {
            super@Child.f() // Call Parent's implementation
            println(super@Child.x) // Uses Parent's implementation of x's getter
        }
    }

    fun test() {
        Son().g()
    }
}

interface Speak {
    fun f() { println("f() in Speak")} // interface functions can have default implementation ,they are 'open' by default
}

class Kid: Parent(), Speak {
    override fun f() {
        super<Parent>.f() // call Parent's f()
        super<Speak>.f() // call Speak's f()
    }
}

abstract class Children : Parent() {

    abstract override fun f() // override can make a nonabstract function abstract. Abstract funtion has no body
}

fun main() {
    //create instance of a class
    val bio = Biosphere("Alphabeta")

    val child = Child()
    child.test()

}