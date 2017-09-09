package com.xiaweizi.kotlin.test6

/**
 * project:     KotlinProject
 * date:        2017/9/9
 * author:      xiaweizi
 * e-mail:      1012126908@qq.com
 * description: single abstract method
 */
fun main(args: Array<String>) {

    while (true) {
        Thread(Runnable {
            run {
                println(System.currentTimeMillis())
                Thread.sleep(100)
            }
        }).start()
    }
}
