package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: Lambda 表达式: {(请求参数)-> (返回结果)} 匿名函数
 */
fun main(args: Array<String>) {

    println("functiona: " + functiona(2, 3))
    println("functiona: " + functiona.invoke(2, 3))

    println("functionb: " + functionb(3, 4))
    println(functiona)

    println("-------------我是完美的分割线-----------------")
    arrayChar.forEach {
        println(it)
    }

    // forEach 进化史
    arrayChar.forEach({element -> println(element)})

    arrayChar.forEach({ println(it)})

    arrayChar.forEach(){ println(it)}

    arrayChar.forEach Foreach@{
        if (it == 'b') return@Foreach
        println(it)}

    println("The end")

    println(test)
    println(::printMessage is () -> Unit)
    println("--------------------")
}

var functiona = fun(arg1: Int, arg2: Int) = arg1 + arg2
var functionb = { arg1: Int, arg2: Int ->
    println("中间可以执行别的语句，返回整个表达式的最后一行")
    arg1 + arg2
} // lambda 表达式：将原先 fun 舍去，添加 {(请求参数)-> (返回结果)}

var arrayChar: CharArray = charArrayOf('a', 'b', 'c', 'd', 'e')

var test = {
    println("printTest")
}

fun printMessage(){
    println("printMessage")
}

var test1 = {arg: Int -> println("123")}

fun testLambda(action: (Int) -> Unit) {
    action(3)
}
