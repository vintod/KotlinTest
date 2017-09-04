package com.xiaweizi.kotlin.test2

/**
 * Created by gkodai on 2017/9/4.
 */

fun main(args: Array<String>) {

    var child: Parent = Parent()

    if (child is Child) {
        println(child) // kotlin 智能转换
    }


    var string: String = "11"
    if (string != null) {
        println(string.length)
    }

    var parent: Parent = Parent()
    var child1: Child? = parent as? Child // 这里进行强转会直接抛出异常
    println(child1)
}
