package com.laisiqi.method;
//无参方法的练习
//* 需求：设计一个方法用于打印两个数中的较大数
//* 思路：
//  * ①定义一个方法，用于打印两个数字中的较大数，例如getMax()
//  * ②方法中定义两个变量，用于保存两个数字
//  * ③使用分支语句分两种情况对两个数字的大小关系进行处理
//  * ④在main()方法中调用定义好的方法
public class MethodTest1 {
    public static void main(String[] args) {

        getMax();
    }

    public static void getMax(){

        int num1 = 10;
        int num2 = 20;

        if(num1 > num2){

            System.out.println("最大值为num1");


        }else {


            System.out.println("最大值为num2");

        }






    }




}
