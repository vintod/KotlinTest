package com.xiaweizi.kotlin.test4

/**
 * class:       KotlinProject
 * data:        2017/9/6
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: 接口代理
 */
interface Drive{
    fun drive()
}

interface Sing{
    fun sing()
}

class CarDrive: Drive{
    override fun drive() {
        println("我会开车呦")
    }
}

class LoveSing: Sing{
    override fun sing() {
        println("我会唱歌呦")
    }
}

class Manager(drive: Drive, sing: Sing): Drive by drive, Sing by sing

fun main(args: Array<String>) {
    val carDrive = CarDrive()
    val loveSing = LoveSing()
    val manager = Manager(carDrive, loveSing)
    manager.drive()
    manager.sing()
}