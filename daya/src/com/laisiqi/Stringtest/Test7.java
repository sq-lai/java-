package com.laisiqi.Stringtest;

import java.util.Scanner;

//键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
//如果要替换的敏感词比较多怎么办？
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        String[] arr = {"TMD","GDX","ctmd","ZZ","lj","FW","nt"};
        for (int i = 0; i < arr.length; i++) {

                str = str.replace(arr[i], "***");

        }

        System.out.println(str);

    }
}
