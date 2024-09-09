package com.laisiqi.operator;

import java.util.Scanner;

//动物园里有两只老虎，两只老虎的体重分别为通过键盘录入获得，
//
//请用程序实现判断两只老虎的体重是否相同。
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入两只老虎的体重");

        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();

        System.out.println(weight1 == weight2);

    }





}
