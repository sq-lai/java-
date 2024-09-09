package com.laisiqi.operator;


import java.util.Scanner;

//键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根 。结果只保留整数部分 ，小数部分将被舍去 。
public class SquareRootTest {
    public static void main(String[] args) {

        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            if (i * i == number) {

                System.out.println(i + "就是" + number + "的平方根整数");

                break;

            } else if (i * i > number) {

                System.out.println((i-1) + "就是" + number +"的平方根整数");

                break;

            }


        }



    }



}
