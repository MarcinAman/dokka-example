package example

/**
 * Documentation for expected **class** Clock
 * in common module
 * Some kind of list
 *
 * 1. Elem
 * 2. Second elem
 *     2. Elem from 2
 *     3. Seconde elem 3
 * 4. Third elem
 *
 * @sample samples.Samples.expect
 * @constructor Set both the name for clock and current time
 * @param int time in seconds given from 1 Jan 1970
 * @param string name of the Clock
 * @author Custom author
 * @see example.House EXPECT it's good to check out this class
 */
expect open class Clock(int: Int, string: String) {

    var property: String

    /**
     * Set the custom name with default time
     * @param string name of the clock
     */
    constructor(string: String)


    /**
     * Set the custom time with default name
     * @param int time in seconds given from 1 Jan 1970
     */
    constructor(int: Int)

    /**
     * Below goes the extension function for int
     *
     * @receiver Simple number
     */
    fun Int.extension(): String

    /**
     * Adds three integers
     * @param a first parameter
     * @param b second parameter
     * @param c third parameter
     */
    fun threeParams(a: Int, b: Int, c: Int): Int

    /**
     * Extension function with generic nullable parameter
     *
     * @receiver Simple number
     * @param bar parameter comment
     */
    fun <T> Int.foo(bar: T?): Unit

    fun getTime(): String
    fun getTimesInMillis(): String
    fun getYear(): String
}
