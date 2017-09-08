package com.xiaweizi.kotlin.test5

/**
 * class:       KotlinProject
 * data:        2017/9/8
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description:
 */
// 如果要实现下面的效果
// f(X) = x * 2 +3
// g(x) = x / 2 + 1
// 请计算 g(f(x)) x = 2 的时候的值
// 思路：先计算 f(x) = 2 * 2 + 3 = 7
//       再计算 g(x) = 7 / 2 + 1 = 4

fun f(anInt: Int): Int = anInt * 2 + 3

fun g(acton: (Int) -> Int, initValue: Int): Int {
    val value = acton(initValue)
    return value / 2 + 1
}

fun main(args: Array<String>) {
    println(g(::f, 2))

    intArray.forEach(::print)

    intArray.forEach(Int::addOne)

    intArray.forEach(AddTwo()::addTwo)
}

fun Int.addOne(): Unit {
    println("addOne:$this")
}

class AddTwo {
    fun addTwo(anInt: Int): Unit {
        println("addTwo:$anInt")
    }
}


val intArray: IntArray = intArrayOf(2, 5, 1, 3, 4)

