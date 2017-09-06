package com.xiaweizi.kotlin.test4

/**
 * project:     KotlinProject
 * date:        2017/9/6
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 方法重载
 */

class OverLoadTest {
//    fun a(anInt: Int = 0) = anInt
    @JvmOverloads
    fun a(anInt: Int = 0, string: String="") = 1
//    fun a() = 1

    fun c() = 1
    fun c(anInt: Int) = ""
}

fun main(args: Array<String>) {
    val test = OverLoadTest()
    test.a(1, "")
    test.a()
    test.a(anInt = 2)
    test.a(string = "")
}