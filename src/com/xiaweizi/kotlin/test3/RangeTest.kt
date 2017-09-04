package com.xiaweizi.kotlin.test3

/**
 * Created by gkodai on 2017/9/4.
 * Range
 */
var range: IntRange = 1..100 // [1, 100]
var rangeExlusive: IntRange = 1 until 100 // [1, 100)
var rangeEmpty: IntRange = 1..-1

fun main(args: Array<String>) {

    println(range.contains(2))
    println(range.toString())
    println(rangeEmpty.isEmpty())

    for (i in range) {
        print("$i,")
    }

    println()
    for (j in rangeExlusive) {
        print("$j,")
    }


    var aInt: Int = 10
    var aLong: Long = aInt.toLong()
    var bInt: Int = aLong.toInt()

    var aString: String = "abcd"
//    var slice = aString.slice(1..20) // 下标越界
//    println(slice)
    var aNum: Number = 20
    println(aNum)
}