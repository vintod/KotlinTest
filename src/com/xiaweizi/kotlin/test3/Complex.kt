package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 自定义操作符
 *                  方法名称必须按照规范已经有的
 *                  传入的参数和返回的类型都是可以改变的
 */

class Complex(var first: Int, var second: Int) {

    operator fun plus(other: Complex): Complex {
        return Complex(first + other.second, second + other.first)
    }

    operator fun plus(other: Int): Complex {
        return Complex(first + other, second + other)
    }

    operator fun plus(other: String): String {
        return "" + first + other
    }

    override fun toString(): String {
        return "Complex(first=$first, second=$second)"
    }


}

class Book(var value: Int) {
    infix fun eq(aInt: Int): Boolean = value == aInt
}


fun main(args: Array<String>) {
    var complex1 = Complex(2, 8)
    var complex2 = Complex(1, 9)

    println(complex1 + complex2)
    println(complex1 + 2)
    println(complex1 + "shabi")

    val book: Book = Book(20)
    println(book eq 20)
    println(book.eq(20))

}
