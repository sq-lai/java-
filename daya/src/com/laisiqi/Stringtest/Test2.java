package com.laisiqi.Stringtest;

import java.util.Scanner;

//键盘录入一个字符串，使用程序实现在控制台遍历该字符串
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();

        System.out.println(s);

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            System.out.println(c);



        }





    }
}
