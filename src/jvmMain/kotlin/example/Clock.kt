package example

import greeteer.Executor
import greeteer.Greeter
import greeteer.Platform

/**
 * JVM actual class
 *
 *
 * @sample samples.Samples.jvm
 * @see example.ParticularClock You should really look into that class but in JVM
 */
actual open class Clock actual constructor(val int: Int, val string: String) {

    /**
     * JVM section of secondary constructor with only String
     *
     * @param string name of the Clock but in JVM
     */
    actual constructor(string: String) : this(0, string)

    actual constructor(int: Int) : this(int, "JVM Clock")

    actual fun getTime(): String = System.currentTimeMillis().toString()

    /**
     * JVM function to retrieve Millis
     */
    actual fun getTimesInMillis(): String = System.currentTimeMillis().toString()

    /**
     * JVM implementation for extension function
     *
     * @receiver JVM receiver is time given in seconds
     */
    actual fun Int.extension(): String = "JVM"

    /**
     * Documentation for onlyJVMFunction on...
     * wait for it...
     * ...JVM!
     */
    fun onlyJVMFunction(): Double = 2.5

    /**
     * Custom equals function
     */
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    open fun getDayOfTheWeek(): String {
        TODO("not implemented")
    }
    actual fun getYear(): String {
        TODO("not implemented")
    }

    /**
     * Sample function with three params
     *
     * @param a JVM simple int
     * @param b JVM another simple int
     * @param c JVM last of these simple ints
     */
    actual fun threeParams(a: Int, b: Int, c: Int) = a * b * c

    actual fun <T> Int.foo(bar: T?): Unit = println("JVM")
    actual var property: String
        get() = "XD"
        set(value) = TODO()
}

fun clockList() = listOf(Clock(0))

fun main() {
    Greeter().greet().also { println(it) }
    println("Kotlin for ${Platform().getPlatform()}/${Executor().run()}")
}