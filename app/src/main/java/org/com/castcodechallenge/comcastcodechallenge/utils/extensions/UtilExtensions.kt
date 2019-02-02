package org.com.castcodechallenge.comcastcodechallenge.utils.extensions

//This set of functions is to manage 2 parameters with let, so, I'm avoiding var1.let{ it.var2.let{...
fun <T1 : Any, T2 : Any, R : Any> safeLet(p1: T1?, p2: T2?, block: (T1, T2) -> R?): R? {
    return if (p1 != null && p2 != null) block(p1, p2) else null
}