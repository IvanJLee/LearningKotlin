package com.kotlin.classes

/**
 * Object Expressions and Declarations
 *
 * @author  Ivan on 2019-03-04 19:26.
 * @version v0.1
 * @since   v1.0
 *
 */
open class Objects(n: Int) {

    open val x = n

    // anonymous objects can be used as types only in local and private declarations
    private fun foo() = object {
        val x = 1
    }

    // Public function, so the return type is Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // Works
//        val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
    }

    companion object Factory {
        fun create(): Objects = Objects()
    }

}

interface AInterface {
    fun run()
}

/**
 * no nontrivial supertypes object
 */
fun obj() {
    val obj = object  {
        val x = 1
        val y = 2.0
    }

    println("${obj.x}, $obj.y")
}

fun main() {

    val obj: Objects = object : Objects(1), AInterface {
        override fun run() {
            println("run")
        }
    }

    val instance = Objects.create()
}