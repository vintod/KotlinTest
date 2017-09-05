package com.xiaweizi.kotlin.test4

abstract class Person(){
    abstract fun work()
}

open class Student{
     open fun work() {
    }
}

class Student1: Student(){
    override fun work() {
        super.work()
    }
}

interface Aaaaa{
     fun ccc()
}

interface Bbbb{
    fun ddd()
}

class Eee: Student(), Aaaaa, Bbbb{
    override fun ccc() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun ddd() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}