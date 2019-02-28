package com.kotlin.classes

import java.lang.AssertionError
import java.lang.Exception
import java.time.Instant

/**
 * Properties and Fields
 *
 * @author  Ivan on 2019-02-28 16:41.
 * @version v0.1
 * @since   v1.0
 *
 */

class Adress {
    /**
     * Properties can be declared as mutable, using the var keyword or read-only using the val keyword.
     */
    var city: String = "New York"
    var street: String = "5th Avenue"
    val state: String = "the USA"

    // getter
    val fullAddr: String
        get() =  city + " " + street + " " + state

    fun copy(that: Adress) {
        val adress = Adress()
        adress.city = that.city
        adress.street = that.street
    }
}

class Property {

    var counter = 0
        set(value) {
            if (value >= 0) field = value // field refer to counter
        }

    var c = 0
        set(value) {
            c = value  // this is a recursive call which would cause StackOverflowError
            field = value
        }

    // back property
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap()
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }

    // lateinit var. The type of the property or variable must be non-null, and it must not be a primitive type.
    lateinit var lazyVal: Adress
}

/**
 * Compile-Time Constants
 *
 *  - Top-level
 *  - Initialized with a value of type String or a primitive type
 *  - No custom getter
 */
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

@Deprecated(SUBSYSTEM_DEPRECATED) fun foo() {
    println(SUBSYSTEM_DEPRECATED)
}

fun main() {
    val property = Property()
    property.counter = 2
//    property.c = 3
    foo()

    // Accessing a lateinit property before it has been initialized throws a special exception
    try {
        println(property.lazyVal)
    } catch (e: Exception) {
        e.printStackTrace()
    }
    property.lazyVal = Adress()
    println(property.lazyVal.fullAddr)
}
