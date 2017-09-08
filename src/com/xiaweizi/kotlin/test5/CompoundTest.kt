package com.xiaweizi.kotlin.test5

/**
 * class:       KotlinProject
 * data:        2017/9/8
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 复合函数
 */

fun main(args: Array<String>) {
    val add1 = {int: Int ->
        println("add1")
        int + 1}
    val add2 = {int : Int ->
        println("add2")
        int + 2}
    var add3 = add1 addThen (add2)
    println(add3(4))
}


infix fun <P1, P2, R> Function1<P1, P2>.addThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p: P1): R{
        return function.invoke(this.invoke(p))
    }
}