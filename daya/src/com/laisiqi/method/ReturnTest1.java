package com.laisiqi.method;
//* 需求：设计一个方法可以获取两个数的较大值，数据来自于参数
//
//* 思路：
//
//  * ①定义一个方法，用于获取两个数字中的较大数
//  * ②使用分支语句分两种情况对两个数字的大小关系进行处理
//  * ③根据题设分别设置两种情况下对应的返回结果
//  * ④在main()方法中调用定义好的方法并使用变量保存
//  * ⑤在main()方法中调用定义好的方法并直接打印结果
public class ReturnTest1 {
    public static void main(String[] args) {

        int maxNumber = getMax(10,20);
        System.out.println(maxNumber);
        System.out.println(getMax(10,20));

    }

    public static int getMax(int a, int b) {
            if (a > b) {

                return a;


            }else {

                return b;
            }


    }
}
