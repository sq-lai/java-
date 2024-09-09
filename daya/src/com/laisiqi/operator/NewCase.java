package com.laisiqi.operator;

//主要练习下case的新特性用法
//需求：键盘录入星期数，输出工作日、休息日。
//
//(1-5) 工作日，(6-7)休息日。
//

import java.util.Scanner;

public class NewCase {

    public static void main(String[] args) {
        System.out.println("请输入一个数字，它会代表是星期几");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch (week) {

            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");





        }







    }



}
