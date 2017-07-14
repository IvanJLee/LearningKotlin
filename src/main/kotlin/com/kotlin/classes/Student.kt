package com.kotlin.classes

/**
 * a student object
 *
 * @author  Ivan on 2017/6/2 11:37.
 * @version v0.1
 * @since   v1.0
 *
 */
class Student : Person, Greet {
    var major = "Computer Science"
    override var age = 20

    constructor() : super(61.4f) {
        this.givenName = "Adam"
    }

    init {
        familyName = "Button"
        age = 19
    }

    override fun greet() {
        super<Greet>.greet()
        super<Person>.greet()
    }

    override fun sayHello() {
        super.sayHello()
        println("I major in $major")
    }
}