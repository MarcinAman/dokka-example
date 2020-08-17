package example

@Retention(AnnotationRetention.SOURCE)
@Deprecated(message = "Sample deprecation message that is very long and i want to make it even longer because why not")
@Target(allowedTargets = [AnnotationTarget.CLASS, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.EXPRESSION, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.PROPERTY])
annotation class SampleClass {
}

enum class SampleEnumXD(s: String, i: Int) {
    SAMPLE("XD2", 1)
}

class XDDDDDDDDD : Annotation {

}


open class Z

open class Y : Z()

//interface C

//class X : Y(), C

open class A { }
interface B
class C : A(), B