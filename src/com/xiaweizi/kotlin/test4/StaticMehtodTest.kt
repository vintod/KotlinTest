package com.xiaweizi.kotlin.test4

/**
 * project:     KotlinProject
 * date:        2017/9/6
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description:
 */

fun main(args: Array<String>) {
    println(Util.plus(1, 2))
}

open class Util private constructor(var anInt: Int) {
    companion object {
        @JvmStatic
        fun plus(first: Int, second: Int) = first + second

        fun copy(util: Util) = Util(util.anInt)
        @JvmField
        val tag = "tag"
    }
}

  fun sum(a: Int) = a


