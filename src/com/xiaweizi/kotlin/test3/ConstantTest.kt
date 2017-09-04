package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 常量和变量
 */

const val aString: String = "hello world" // 加 const 代表编译器常量
var bString = "myHello world"

fun main(args: Array<String>) {
    var a: A = A()
}

class A() {
    private val aString: String = "hello world"
    var bString = "myHello world"
}