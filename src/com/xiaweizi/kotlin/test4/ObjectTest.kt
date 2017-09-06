package com.xiaweizi.kotlin.test4

object NetUtil: getDataField(), getDataSuccess{
    override fun success() {
        println("success")
    }

    override fun failed() {
        println("failed")
    }

    val state: Int = 0
    fun getData(): String = "请求成功"
}

fun main(args: Array<String>) {
    println(NetUtil.state)
    println(NetUtil.getData())
    NetUtil.success()
    NetUtil.failed()
}

interface getDataSuccess{
    fun success()
}

abstract class getDataField{
    abstract fun failed()
}