package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 分支表达式 when 表达式
 */

fun main(args: Array<String>) {
    println("dda")
    println("testWhen-------------")
    println(testWhen(24))
    println("testIf-------------")
    println(testIf("aa"))
}

fun testIf(value: String):String = if (value == "bb") "yes" else "No"

fun testWhen(aInt: Int) = when (aInt) {
    !is Int, in 2..20 -> {
        println("is int")
        print("dada")
    }
    else -> {
        println("is not int")
    }
}
