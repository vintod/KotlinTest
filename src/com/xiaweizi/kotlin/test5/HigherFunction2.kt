package com.xiaweizi.kotlin.test5

/**
 * class:       KotlinProject
 * data:        2017/9/8
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: kotlin 中常用的高阶函数 2
 */
fun main(args: Array<String>) {
//    filterTest()
//    takeWhileTest()
    letTest()
}

fun filterTest() {
    val ints = listOf(1, 2, 3, 4, 5, 6)
    println(ints.filter { element -> element % 2 == 0 })
}

// 当值不是奇数就去，遇到偶数就停止了
fun takeWhileTest() {
    val ints = listOf(1, 3, 3, 4, 5, 6)
    println(ints.takeWhile { it % 2 != 0 })
}

fun letTest() {
    findPerson()?.let { (name, age) -> println("name:$name, age:$age") }
    findPerson()?.apply { println("name:$name, age:$age") }
    with(findPerson()!!) { println("name:$name, age:$age") }
}

data class Person(val name: String, val age: Int)

fun findPerson(): Person? {
    return Person("aa", 23)
}