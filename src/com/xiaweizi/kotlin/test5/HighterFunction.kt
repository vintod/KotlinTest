package com.xiaweizi.kotlin.test5

/**
 * project:     KotlinProject
 * date:        2017/9/7
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 高阶函数
 */

// 这两个类似，都是匿名函数
val sum = {first: Int, second: Int -> first + second}
val multi = fun(first: Int, second: Int):Int {
    return first * second
}

val ints = intArrayOf(1, 2, 3, 4)

fun main(args: Array<String>) {
    println(sum.invoke(3, 2))
    println(multi(3, 5))

    ints.forEach(::print)
    println("------------")
    println(ints.filter {value -> value==2})

    String::isNotEmpty

    println("Aa: ${Aa(Bb()::cc)}")

    test (String::isNotEmpty)
    test1 (Bb::ee)

    args.filter(String::isNotEmpty)
}

fun test(predicate: (String) -> Boolean){
}

fun test1(action: (Bb) -> Boolean){

}


// 传入 (Int) -> Unit 类型的函数。然后对函数进行处理
fun Aa(action: (Int) -> Int): Int{
    println("before action anInt:")
    return  action(1)
}

class Bb{
    var sba = ""
}

fun Bb.cc(anInt: Int):Int {
    println("after action anInt:$anInt")
    return anInt + 2
}

fun Bb.ee():Boolean {
    println("after action anInt:")
    return false
}