package com.xiaweizi.kotlin.test5

/**
 * class:       KotlinProject
 * data:        2017/9/8
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 闭包函数
 */

fun main(args: Array<String>) {
    println(add(2)(5))
}

fun add(x: Int) = fun(y: Int) = {
    println("x:$x, y:$y")
    x + y }
