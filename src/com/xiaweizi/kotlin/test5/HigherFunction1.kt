package com.xiaweizi.kotlin.test5

/**
 * class:       KotlinProject
 * data:        2017/9/8
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 高阶函数的一些例子
 */

fun main(args: Array<String>) {
//    forEachTest()
//    mapTest()
//    flatMapTest()
//    reduceTest()
    foldTest()
}

// 遍历
fun forEachTest() {
    val strings: Array<String> = arrayOf("aa", "ee", "bb", "ll")

    strings.forEach { println(it) } // 遍历每一个值
    strings.forEachIndexed { index, s -> println("index:$index,String:$s") } // 遍历 下标和值一一对应

}

// 重新拷贝一个值
fun mapTest() {
    val strings: Array<String> = arrayOf("aa", "ee", "bb", "ll")
    var map = strings.map { "$it-test" }
    map.forEach { print("$it\t") }
}

// 将集合合体
fun flatMapTest() {
    val lists = listOf(1..10,
            2..11,
            3..12)

    var flatMap = lists.flatMap {
        it.map {
            "No.$it"
        }
    }
    flatMap.forEach(::println)
}

fun reduceTest() {
    val ints = listOf(2, 3, 4, 5)
    println(ints.reduce { acc, i ->
        acc + i
    })
}

// 字符串连接
fun foldTest(){
    val ints = listOf(2, 3, 4, 5)
    println(ints.fold(StringBuffer(), { acc, i -> acc.append("$i,") }))
    println(ints.joinToString(","))
}