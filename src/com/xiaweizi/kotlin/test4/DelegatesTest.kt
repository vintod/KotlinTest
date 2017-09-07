package com.xiaweizi.kotlin.test4

import kotlin.reflect.KProperty

/**
 * class:       KotlinProject
 * data:        2017/9/7
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 属性代理
 */
fun main(args: Array<String>) {
    val a: Int by DelegatesTest()
    println(a)

    var b: Int by DelegatesTest()
    b = 3
    println(b)
}

class DelegatesTest {
    private var anInt: Int? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        println("getValue")
        return anInt?:0
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int): Unit {
        println("setValue")
        this.anInt = value
    }
}