package com.laisiqi.demo1;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        System.out.println("现在开始数字小游戏，请你输入两个数字我给你他们相加后的值");
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("请输入第一个数字");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(a+b);
        //字体和字号修改了consolas程序员专用，字号16
        //注释默认的是灰色不好，也换了

    }


}
