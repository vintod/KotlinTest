package com.xiaweizi.kotlin.test3

import java.lang.Exception

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 异常
 */

fun main(args: Array<String>) {
    val a = 1
    val b = 0
    val resutl = try {
        println("try 内部")
        a / b
        0
    } catch (e: Exception){
        println("catch 内部")
        e.printStackTrace()
        2
    } finally {
        println("finally 内部")
        3
    }

    println(resutl)
}
