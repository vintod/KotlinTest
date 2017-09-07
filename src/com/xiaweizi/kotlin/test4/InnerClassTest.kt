package com.xiaweizi.kotlin.test4

/**
 * class:       KotlinProject
 * data:        2017/9/7
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: kotlin 中的内部类和匿名内部类
 */

class Outer{
    var string: String = "outer"
    class Inner1{
        var string: String = "inner1"
        fun sum(first: Int, second: Int) = first + second
    }

    inner class Inner2{
        var string: String = "inner2"
        fun cha(first: Int, second: Int) = first - second
        fun getInnerField() = this.string
        fun getOuterField() = this@Outer.string
    }
}

fun main(args: Array<String>) {
    val inner1 = Outer.Inner1()
    val inner2 = Outer().Inner2()

    println(inner1.sum(1, 2))

    println(inner2.cha(2, 1))
    println(inner2.getInnerField())
    println(inner2.getOuterField())

    val listener: onClickListener = object : Father(), Mother, onClickListener{
        override fun sing() {
            println("mother sing")
        }

        override fun teach() {
            println("father teach")
        }

        override fun onClick() {
            println("匿名内部类")
        }
    }
    listener.onClick()
}


interface onClickListener{
    fun onClick()
}

open class Father{
    open fun teach(){

    }
}

interface Mother{
    fun sing()
}