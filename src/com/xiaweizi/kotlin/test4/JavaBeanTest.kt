package com.xiaweizi.kotlin.test4

/**
 * class:       KotlinProject
 * data:        2017/9/7
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: kotlin 中的 JavaBean
 */

data class UserBean(var name: String, var age: Int)

fun main(args: Array<String>) {
    val userBean: UserBean = UserBean("小芳", 23)
    println(userBean.name)
    println(userBean.toString())

    println(userBean.component1())
    println(userBean.component2())

    val (name, age) = userBean
    println("name: $name")
    println("age: $age")

    val complex = Complex()
    val (a, b, c) = complex
    println(a + b + c)
}

class Complex{
    operator fun component1() = "你好呀"
    operator fun component2() = 2
    operator fun component3() = 'a'
}