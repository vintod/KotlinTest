package com.xiaweizi.kotlin.test4

/**
 * project:     KotlinProject
 * date:        2017/9/6
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 扩展方法
 */

fun main(args: Array<String>) {
    var string = "xiaweizi"
    println(string.add(5))
    println(string * (3))
}

fun String.add(anInt: Int): String {
    var sb = StringBuilder()
    for (i in 0 until anInt) {
        sb.append(this)
    }
    return sb.toString()
}

operator fun String.times(anInt: Int): String {
    var sb = StringBuilder()
    for (i in 0 until anInt) {
        sb.append(this)
    }
    return sb.toString()
}

