package example

//interface SampleClass {
//    val platform: String
//}
//
//class SampleClassImpl(override val platform: String) : SampleClass {
//
//}

interface Highest { }

open class HighestImpl: Highest { }

interface Lower { }

interface LowerImplInterface: Lower { }

class Tested : HighestImpl(), LowerImplInterface { }

enum class SampleEnumXD(s: String, i: Int) {
    SAMPLE("XD", 1)
}