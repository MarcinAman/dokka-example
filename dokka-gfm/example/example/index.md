//[example](../index.md)/[example](index.md)



# Package example  
 [example/example/commonMain, example/example/jsMain, example/example/jvmAndJsSecondCommonMain, example/example/linuxX64Main]  [example/example/jvmMain] This is JVM documentation for package example

## Types  


| | |
|---|---|
| [AnotherParticularClock](-another-particular-clock/index.md)| class [AnotherParticularClock](-another-particular-clock/index.md) : [InterfaceToInheritFrom](-interface-to-inherit-from.md)|
| [Clock](-clock/index.md)| Documentation for expected **class** Clock in common module Some kind of list

1. Elem  
1. Second elem  
    2. Elem from 2  
    2. Seconde elem 3  
1. Third elem  


Documentation for actual class Clock in JSJVM actual classopen class [Clock](-clock/index.md)(**int**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html),**string**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))|
| [ClockDays](-clock-days/index.md)| enum [ClockDays](-clock-days/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)|
| [Highest](-highest.md)| interface [Highest](-highest.md)|
| [HighestImpl](-highest-impl/index.md)| open class [HighestImpl](-highest-impl/index.md) : [Highest](-highest.md)|
| [House](-house/index.md)| Basic description for House classclass [House](-house/index.md)(**street**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html),**number**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))|
| [InterfaceToInheritFrom](-interface-to-inherit-from.md)| interface [InterfaceToInheritFrom](-interface-to-inherit-from.md)|
| [Lower](-lower.md)| interface [Lower](-lower.md)|
| [LowerImplInterface](-lower-impl-interface.md)| interface [LowerImplInterface](-lower-impl-interface.md) : [Lower](-lower.md)|
| [ParticularClock](-particular-clock/index.md)| class [ParticularClock](-particular-clock/index.md)(**clockDay**: [ClockDays](-clock-days/index.md)) : [InterfaceToInheritFrom](-interface-to-inherit-from.md), [Clock](-clock/index.md)|
| [SampleClass](-sample-class/index.md)| @[Retention](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-retention/index.html)(value = [AnnotationRetention.SOURCE](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-retention/-s-o-u-r-c-e/index.html))@[Deprecated](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-deprecated/index.html)(message = "Sample deprecation message that is very long and i want to make it even longer because why not")@[Target](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-target/index.html)(allowedTargets = [[AnnotationTarget.CLASS](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-c-l-a-s-s/index.html), [AnnotationTarget.ANNOTATION_CLASS](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-a-n-n-o-t-a-t-i-o-n_-c-l-a-s-s/index.html), [AnnotationTarget.CONSTRUCTOR](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-c-o-n-s-t-r-u-c-t-o-r/index.html), [AnnotationTarget.EXPRESSION](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-e-x-p-r-e-s-s-i-o-n/index.html), [AnnotationTarget.FIELD](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-f-i-e-l-d/index.html), [AnnotationTarget.LOCAL_VARIABLE](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-l-o-c-a-l_-v-a-r-i-a-b-l-e/index.html), [AnnotationTarget.PROPERTY](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.annotation/-annotation-target/-p-r-o-p-e-r-t-y/index.html)])annotation class [SampleClass](-sample-class/index.md)|
| [Tested](-tested/index.md)| class [Tested](-tested/index.md) : [LowerImplInterface](-lower-impl-interface.md), [HighestImpl](-highest-impl/index.md)|




## Functions  


| | |
|---|---|
| [clockList](clock-list.md)| fun [clockList](clock-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)[Clock](-clock/index.md)|
| [extensionFun](extension-fun.md)| A sample extension function When $a \ne 0$, there are two solutions to \(ax^2 + bx + c = 0\) and they are $$x = {-b \pm \sqrt{b^2-4ac} \over 2a}.$$fun [Clock](-clock/index.md).[extensionFun](extension-fun.md)()|
| [main](main.md)| fun [main](main.md)()|



