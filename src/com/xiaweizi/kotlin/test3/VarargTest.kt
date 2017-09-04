package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 具名参数 即 参数名 = 值
 *              变长参数 vararg 修饰，相当于数组
 *              默认参数 调用方法的时候可以不传值，在方法参数传默认值
 */
fun main(args: Array<String>) {
    val arrays :Array<String> = arrayOf("dd", "rr")
    fun1("2","3",int = 2)
    fun2(arg = *arrays)
    println(sum(second = 2, first = 1))
}

fun fun1(vararg arg: String, int: Int): Unit {
    println(int)
    for (s in arg) {
        println(s)
    }
}

fun fun2(int: Int = 100, vararg arg: String): Unit {
    println(int)
    for (s in arg) {
        println(s)
    }
}

fun sum(first: Int, second: Int) = first + second