package com.xiaweizi.kotlin.test6

/**
 * project:     KotlinProject
 * date:        2017/9/9
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 正则表达式
 */

fun main(args: Array<String>) {
    val source = "Hello This my phone number: 010-12345678."
    val pattern = """.*(\d{3}-\d{8}).*"""

    Regex(pattern).findAll(source).toList().flatMap(MatchResult::groupValues).forEach(::print)
}