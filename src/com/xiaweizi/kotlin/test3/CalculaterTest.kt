package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 计算器小事例
 */


fun main(args: Array<String>) {

    while (true) {
        println("请输入您要计算的数：格式如下：3 + 4")
        try {
            val input = readLine()
            if (input != null) {
                val split = input.trim().split(" ")
                if (split.size != 3) {
                    throw IllegalArgumentException("参数有误")
                }
                var first = split[0].toDouble()
                var op = split[1]
                var second = split[2].toDouble()
                println("$first $op $second = ${Operator(op)(first, second)}")
            }
        } catch (e: NumberFormatException) {
            println("您输入可能不是数字")
        } catch (e: IllegalArgumentException) {
            println("您可能输入的格式有误" + e.message)
        } catch (e: Exception) {
            println("出现未知错误" + e.message)
        }
        println("是否继续[Y]?")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            println("感谢使用我们的软件")
            return
        }
    }

}


class Operator(value: String) {
    val opFun: (first: Double, second: Double) -> Double

    init {
        opFun = when (value) {
            "+" -> { f, s -> f + s }
            "-" -> { f, s -> f - s }
            "*" -> { f, s -> f * s }
            "/" -> { f, s -> f / s }
            else -> {
                throw UnsupportedOperationException(value)
            }
        }
    }

    operator fun invoke(first: Double, second: Double): Double { return opFun(first, second)}
}