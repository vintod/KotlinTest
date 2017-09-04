package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description:
 */
class Student(var age: Int, name: String) {
    // 构造方法中参数 var 修饰则代表是成员变量
    // 否则只是一个参数

    // 延迟初始化 val 属性
    val person: Person by lazy {
        Person()
    }

    lateinit var sex: String // 延迟初始化 var 属性

}

class Person() {
    public var b = 0
        get() { // 自定义 get
            println("get")
            field += 1
            return field
        }
        set(value) { // 自定义 set
            println("set")
            field = value + 2
        }
}

fun main(args: Array<String>) {
    var person: Person = Person()
    person.b = 4
    println(person.b)
}

