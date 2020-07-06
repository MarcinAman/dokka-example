//[example](../../index.md)/[example](../index.md)/[Clock](index.md)



# Clock  
 [example/example/commonMain] Documentation for expected **class** Clock in common module Some kind of list

1. Elem  
1. Second elem  
    2. Elem from 2  
    2. Seconde elem 3  
1. Third elem  




#### Author  
Custom authoropen class [Clock](index.md)(**int**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),**string**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) [example/example/jsMain] Documentation for actual class Clock in JSopen class [Clock](index.md)(**int**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),**string**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) [example/example/jvmMain] JVM actual classopen class [Clock](index.md)(**int**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),**string**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) [example/example/linuxX64Main] open class [Clock](index.md)(**int**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),**string**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

## Samples  
 [example/example/commonMain] samples.Samples.expect [example/example/jsMain] println("Hi, JS!") [example/example/jvmMain] println("Hi, JVM!") [example/example/linuxX64Main] 

## See also  


| | |
|---|---|
| [example.House](../-house/index.md)| EXPECT it's good to check out this class|
| [example.House](../-house/index.md)| Nice to look at this class but from JS|
| [example.ParticularClock](../-particular-clock/index.md)| You should really look into that class but in JVM|




## Parameters  


| | |
|---|---|
| int| time in seconds given from 1 Jan 1970|
| string| name of the Clock|
| int| native integer param|
| string| native string param|




## Constructors  


| | |
|---|---|
| [init](-init-.md)|  [example/example/commonMain] Set the custom name with default timefun [init](-init-.md)(string: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) [example/example/jsMain] fun [init](-init-.md)(string: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) [example/example/jvmMain] JVM section of secondary constructor with only Stringfun [init](-init-.md)(string: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) [example/example/linuxX64Main] Native secondary constructor with only stringfun [init](-init-.md)(string: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))|
| [init](-init-.md)|  [example/example/commonMain] Set the custom time with default namefun [init](-init-.md)(int: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) [example/example/jsMain, example/example/jvmMain] fun [init](-init-.md)(int: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) [example/example/linuxX64Main] Native secondary constructor with only Intfun [init](-init-.md)(int: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))|




## Functions  


| | |
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Custom equals functionopen operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)|
| [extension](extension.md)| Below goes the extension function for intJS implementation for extension functionJVM implementation for extension functionNative implementation for extension functionfun [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html).[extension](extension.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)|
| [foo](foo.md)| Extension function with generic nullable parameterfun [T](foo.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)? [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html).[foo](foo.md)(bar: [T](foo.md)?)|
| [getDayOfTheWeek](get-day-of-the-week.md)| open fun [getDayOfTheWeek](get-day-of-the-week.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)|
| [getTime](get-time.md)| fun [getTime](get-time.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)|
| [getTimesInMillis](get-times-in-millis.md)| JVM function to retrieve MillisNativefun [getTimesInMillis](get-times-in-millis.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)|
| [getYear](get-year.md)| fun [getYear](get-year.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)|
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)|
| [onlyJsFunction](only-js-function.md)| fun [onlyJsFunction](only-js-function.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)|
| [onlyJVMFunction](only-j-v-m-function.md)| Documentation for onlyJVMFunction on... wait for it... ...JVM!fun [onlyJVMFunction](only-j-v-m-function.md)(): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)|
| [onlyNativeFunction](only-native-function.md)| fun [onlyNativeFunction](only-native-function.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)|
| [threeParams](three-params.md)| Adds three integersJS implementation for threeParams functionSample function with three paramsfun [threeParams](three-params.md)(a: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), b: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), c: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)|
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)|




## Properties  


| | |
|---|---|
| [int]()|  [example/example/jsMain, example/example/jvmMain] val [int](): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) [example/example/linuxX64Main] native integer paramval [int](): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)|
| [string]()|  [example/example/jsMain, example/example/jvmMain] val [string](): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) [example/example/linuxX64Main] native string paramval [string](): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)|




## Inheritors  


| |
|---|
| [ParticularClock](../-particular-clock/index.md)|


