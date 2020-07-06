package example

import greeteer.Executor

/**
 * @constructor Native constructor
 * @param int native integer param
 * @param string native string param
 */
actual open class Clock actual constructor(val int: Int, val string: String) {

    /**
     * Native secondary constructor with only string
     * @param string the name of Clock in Native
     */
    actual constructor(string: String) : this(0, string)

    /**
     * Native secondary constructor with only Int
     */
    actual constructor(int: Int) : this(int, "Native Clock")


    actual fun getTime() = ""
    fun onlyNativeFunction(): Int = 42

    /**
     * Native
     */
    actual fun getTimesInMillis(): String = ""

    actual fun getYear(): String = ""

    /**
     * Native implementation for extension function
     *
     * @receiver Native receiver is time given in seconds
     */
    actual fun Int.extension(): String = "Native"

    actual fun threeParams(a: Int, b: Int, c: Int) = a + b + c

    actual fun <T> Int.foo(bar: T?): Unit = Unit
    actual var property: String
        get() = TODO("Not yet implemented")
        set(value) {}
}

fun main() {
    println("Kotlin for Linux/${Executor().run()}")
}