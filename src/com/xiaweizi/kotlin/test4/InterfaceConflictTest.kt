package com.xiaweizi.kotlin.test4

/**
 * class:       KotlinProject
 * data:        2017/9/6
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 接口冲突测试
 */
interface IRun{
    fun run(){
        println("空实现 IRun")
    }
}

interface ISwim{
    fun swim(){
        println("空实现 ISwim")
    }
}

class Person1() : ISwim{

}

fun main(args: Array<String>) {
    val person = Person1()
    person.swim()

    val d = D(2)
    println(d.a())
    val d1 = D(12)
    println(d1.a())
    val d2 = D(122)
    println(d2.a())
}


interface A{
    fun a() = 0
}

interface B{
    fun a() = 1
}

interface C{
    fun a() = 2
}

class D(var aInt: Int): A,B,C{
    override fun a(): Int {
        return when(aInt){
            in 1..10 ->{
                super<A>.a()
            }
            in 11..100 ->{
                 super<B>.a()
             }
            else -> {
                println("dd")
                super<C>.a()
            }
        }
    }
}

