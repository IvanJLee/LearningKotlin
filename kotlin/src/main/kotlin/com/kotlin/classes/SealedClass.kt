package com.kotlin.classes

/**
 * Sealed Classes
 *
 * @author  Ivan on 2019-03-01 14:36.
 * @version v0.1
 * @since   v1.0
 *
 */

sealed class Expr

/**
 * A sealed class can have subclasses, but all of them must be declared in the same file as the sealed class itself.
 */
data class Const(val number: Double) : Expr()

data class Sum(val e1: Expr, val e2: Expr) : Expr()

object NotNumber: Expr()