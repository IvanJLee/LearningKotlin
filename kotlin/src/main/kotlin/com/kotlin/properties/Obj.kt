package com.kotlin.properties

import java.util.*

/**
 * the properties and fields
 *
 * @author  Ivan on 2017/7/14 15:11.
 * @version v0.1
 * @since   v1.0
 *
 */
class Obj {

    //The full syntax for declaring a property is
    var name: String
        set(value) {
            name = value
        }
        get() {
            return name
        }

    // Since Kotlin 1.1, you can omit the property type if it can be inferred from the getter:
    val isValid get() = true //Boolean type

    var setterVisibility: String = "abc"
    private set // the setter is private and has the default implementation

    //use annotation for setter
    var setterAnnotation: Any? = null
    @Inject set

    //backing fields
    var counter = 0 // the initializer value is written directly to the backing field
        set(value) {
            if (value >= 0) field = value
        }

    //backing property
    private var _table: Map<String, String>? = null
    public val table: Map<String, String>
        get() {
            if (_table == null) {
                _table = HashMap<String, String>()
            }
            return _table ?: throw AssertionError("set Null by another thread")
        }

    //late initialize
    lateinit var subject: String
}

//compile time constants
const val CONST: String = "C"