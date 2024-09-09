package com.laisiqi.stringbuilder;

import java.util.Scanner;

//需求：
//
//	键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();
        //用StringBuilder反转来对比

        String reverseS = new StringBuilder(s).reverse().toString();

        if (s.equals(reverseS)){

            System.out.println("当前字符串是对称字符串");

        }else{
            System.out.println("当前字符串不是对称字符串");
        }
    }
}
