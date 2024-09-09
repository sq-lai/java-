package com.laisiqi.operator;

import java.util.Scanner;

//小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，
//
//假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
//95~100 自行车一辆
//90~94   游乐场玩一天
//80 ~ 89 变形金刚一个
//80 以下  胖揍一顿
public class ProcessControl {
    public static void main(String[] args) {
        System.out.println("请输入小明的得分");
        Scanner sr = new Scanner(System.in);
        int score = sr.nextInt();
        //开始底层逻辑

        if (score >=0 && score <= 100) {

            if (score >= 95 && score <= 100) {

                System.out.println("自行车一辆");

            } else if (score >= 90 && score <= 94) {

                System.out.println("游乐场玩一天");
            } else if (score >= 80 && score <= 89) {

                System.out.println("变形金刚一个");


            } else {


                System.out.println(" 胖揍一顿");
            }


        }else {

            System.out.println("分数无效");

        }







    }
}
