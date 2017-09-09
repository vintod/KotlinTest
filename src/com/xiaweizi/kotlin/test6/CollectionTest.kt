package com.xiaweizi.kotlin.test6

/**
 * project:     KotlinProject
 * date:        2017/9/9
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 集合
 */

fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("Hello")
    arrayList.add("Kotlin")
    arrayList.add("Java")
    arrayList.forEach(::print)
    arrayList.removeAt(1)
    arrayList.forEach(::print)

    val map = mapOf(1 to "a", 2 to "b")
    map.forEach(::print)
}