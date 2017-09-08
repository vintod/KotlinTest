package com.xiaweizi.kotlin.test5

import java.io.File

/**
 * class:       KotlinProject
 * data:        2017/9/8
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 统计字符串个数的小例子
 */

fun main(args: Array<String>) {
    val map: HashMap<Char, Int> = HashMap()
    var toCharArray = File("build.gradle").readText().toCharArray()
    var filterNot: List<Char> = toCharArray.filterNot(Char::isWhitespace)
    filterNot.forEach {
        val count: Int ?= map[it]
        if (count == null) {
            map[it] = 1
        } else {
            map[it] = count + 1
        }
    }
//    map.forEach(::println)

    toCharArray.groupBy { it }.map { it.key to  it.value.size }.forEach { println(it) }
}
