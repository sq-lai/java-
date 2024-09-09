package com.laisiqi.operator;

import java.util.Scanner;

public class NumberDivision {
    public static void main(String[] args) {
        System.out.println("请输入一个三位整数，我们会将其拆分个位、十位、百位输出");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int ones = number % 10;

        int tens = (number / 10) % 10;

        int hundreds = (number / 100) % 10;

        System.out.println("其个位数字是：" + ones);
        System.out.println("其十位数字是：" + tens);
        System.out.println("其百位数字是：" + hundreds);
    }
}

/*
一开始就要练好规范，命名规则大驼峰、变量取名！！！




 */