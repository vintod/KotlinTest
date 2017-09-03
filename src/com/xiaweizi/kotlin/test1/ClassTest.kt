package com.xiaweizi.kotlin.test1

/**
 * 类测试
 * */
fun main(args: Array<String>) {
    println("name")
    var student = Student("xiaweizi", 12)
    var teacher = Teacher("qijiayan", 35)
}


class Student(name: String, age: Int): Person(name, age)
class Teacher(name: String, age: Int): Person(name, age)

open class Person(name: String, age: Int) {
    init {
        println(this.javaClass.simpleName + "name: $name, age: $age")
    }
}
