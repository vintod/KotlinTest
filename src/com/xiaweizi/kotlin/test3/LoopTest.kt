package com.xiaweizi.kotlin.test3

/**
 * class:       KotlinProject
 * data:        2017/9/4
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 循环
 */
var strings: Array<String> = arrayOf("aa", "bb", "cc", "dd")
var ints: IntArray = intArrayOf(1, 2, 3, 5)

fun main(args: Array<String>) {
    for ((index, value) in strings.withIndex()) {
        println("$index, $value")
    }

    for (indexValue in ints.withIndex()) {
        println("${indexValue.index}, ${indexValue.value}")
    }

//    testWhile()
    var list = MyList()
    list.add(23)
    list.add(12)
    list.add(32)

    for (i in list) {
        println(i)
    }

}

private fun testWhile() {
    var aInt: Int = 6;
    while (aInt >= 4) {
        println(aInt)
        aInt--
    }
    println("---------------")
    aInt = 6
    do {
        println(aInt)
        aInt--
    } while (aInt >= 4)
}

class MyIterator(val iterator: Iterator<Int>){
    operator fun next(): Int = iterator.next()
    operator fun hasNext(): Boolean = iterator.hasNext()
}

class MyList{
    val lists = ArrayList<Int>()
    fun add(int: Int) = lists.add(int)
    fun remove(int: Int) = lists.remove(int)

    operator fun iterator(): MyIterator{
        return MyIterator(lists.iterator())
    }
}