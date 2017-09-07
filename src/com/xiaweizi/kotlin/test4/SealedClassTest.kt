package com.xiaweizi.kotlin.test4

/**
 * class:       KotlinProject
 * data:        2017/9/7
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: kotlin 密封类
 */

sealed class SealedClassTest{
    class sum(first: Int, seocnd: Int): SealedClassTest()
    class cha(first: Int, seocnd: Int): SealedClassTest()

    object Bean: SealedClassTest()
}

enum class HttpStatus(val anInt: Int){
    SUCCESS(0), FAILED(1), LOADING(2)
}

fun main(args: Array<String>) {
    val class1 = SealedClassTest.cha(1, 2)
    println(HttpStatus.SUCCESS)
}
