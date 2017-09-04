package com.xiaweizi.kotlin.test2;

/**
 * Created by gkodai on 2017/9/4.
 */
public class JavaTest {

    public static void main(String[] args) {
        Parent child = new Child();
        System.out.println(((Child) child).name);
    }
}
