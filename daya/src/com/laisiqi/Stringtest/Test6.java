package com.laisiqi.Stringtest;

import java.util.Scanner;

//需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
//
//最终效果为：`131****9468`
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String newStr = "";
        String start = str.substring(0, 3);
        String end = str.substring(7);
        newStr = start + "****" + end;
        System.out.println(newStr);
    }
}
