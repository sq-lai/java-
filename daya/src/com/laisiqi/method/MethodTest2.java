package com.laisiqi.method;
//带参数方法练习
//* 需求：设计一个方法用于打印两个数中的较大数，数据来自于方法参数 }
//* 思路：
//  * ①定义一个方法，用于打印两个数字中的较大数，例如getMax()
//  * ②为方法定义两个参数，用于接收两个数字
//  * ③使用分支语句分两种情况对两个数字的大小关系进行处理
//  * ④在main()方法中调用定义好的方法（使用常量）
//  * ⑤在main()方法中调用定义好的方法（使用变量）
//*
public class MethodTest2 {
    public static void main(String[] args) {

        getMax(20,20);

    }

    public static void getMax(int a,int b) {

        if(a > b){

            System.out.println(a);


        } else if (a < b) {

            System.out.println(b);

        }else {

            System.out.println("一样大！");

        }


    }
}
