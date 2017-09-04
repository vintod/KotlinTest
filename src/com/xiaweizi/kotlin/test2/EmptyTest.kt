package com.xiaweizi.kotlin.test2

var aString: String = ""

fun main(args: Array<String>) {
    println(aString.length)
    println(getString()?.length)

    getString() ?: return // 这里加个 问号，意思是如果 getString 为空，那么直接 return

    var name1: String? = getString()

    println(name1!!.length) // !! 意思是 name1 我已经确定不可能为空，请放心大胆的执行吧


}

/**
 * 加个问号，意思是可以返回 null
 */
fun getString(): String? {
    return ""
}