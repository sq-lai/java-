package com.laisiqi.Stringtest;

import java.util.Scanner;

//键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        int bigString = 0;
        int smallString = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if(c >= 'a' && c <= 'z'){
                bigString++;
            } else if (c >= 'A' && c <= 'Z') {
                smallString++;

            }else if (c >= '0' && c <= '9') {

                count++;
            }


        }
        System.out.println("小学字母" + bigString);
        System.out.println("大写字母" + smallString);
        System.out.println("数字字符" + count);
    }
}
