package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description:
 */

fun main(args: Array<String>) {
    var sum = add(2,4)
    println(sum)

    println(intToLong(2)) // 调用变量直接调用函数，照样是要存入参数
}

fun add(arg1: Int, arg2: Int) = arg1 + arg2

var intToLong = fun(arg: Int) = arg.toLong() // 匿名函数，没有方法名