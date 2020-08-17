package example

annotation class Author(val name: String)

/**
 * Basic description for House class
 * @constructor This is House constructor
 * @param number the number of the house
 * @param street the name of the street
 */
@Author(
        name = "Benjamin Franklin"
)
class House(val street: String, val number: Int) {

    /**
     * The owner of the house
     */
    var owner: String = ""

    /**
     * The different owner of the house
     */
    val differentOwner: String = ""

    /**
     * Add another floot
     */
    fun addFloor() {}


    class Basement {
        val pickles : List<Any> = mutableListOf()
    }

    companion object {
        val DEFAULT = House("",0)
    }
}

interface TestInterface {
    fun testFunction(): String = ""
}

class TestClass {

}

val TestClass.testProperty : String
    get() = "XD"