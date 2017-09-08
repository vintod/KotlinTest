package com.xiaweizi.kotlin.test5

import java.io.OutputStream

/**
 * class:       KotlinProject
 * data:        2017/9/8
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 科里化
 */
fun main(args: Array<String>) {
    log("TEST")(System.out)("this is a test")
}

fun log(tag: String)
    = fun(out: OutputStream)
    = fun(message: String)
    = out.write("[$tag], $message".toByteArray())

fun log(tag: String, out: OutputStream, message: String){
    out.write("[$tag], $message".toByteArray())
}