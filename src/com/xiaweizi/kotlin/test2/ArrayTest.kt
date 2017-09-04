package com.xiaweizi.kotlin.test2

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: kotlin 数组
 */

fun main(args: Array<String>) {

    println(aIntArray[2])
    println(aIntArray.size)

    println(String(charArray))
    println(charArray.joinToString())
    println(charArray.joinToString(""))

    println(stringArray.slice(1..4))
    println(charArray.slice(0 until 3))
}

var aIntArray: IntArray = intArrayOf(1,2,5,4,4,6)
var charArray: CharArray = charArrayOf('a', 'b', 'c', 'd', 'e')
var stringArray: Array<String> = arrayOf("aa", "bb", "cc", "dd", "e")

