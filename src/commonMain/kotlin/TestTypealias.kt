package example

typealias Normal = String

/***
 * @param Z - Ty...
 */
typealias Generic<Z, I, O, B, R> = String

/**
 * @param T -  Ty...
 */
class Generic2<T>{
}

//class Outer<E, F> {
//    inner class Inner<G> {
////        @Suppress("TOPLEVEL_TYPEALIASES_ONLY")
//        typealias TA<H> = Map<Map<E, F>, Map<G, H>>
//    }
//}