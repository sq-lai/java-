package com.laisiqi.operator;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        //10除以3，10.0除以3这种类似的不可以加双引号，不然会检索为字符串输出就没有计算了
        System.out.println(a / b);
        System.out.println(10.0 / 3);

        System.out.println(10 % 2);
        System.out.println( 10.0 % 3);


    }




}
