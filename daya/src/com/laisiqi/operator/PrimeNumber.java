package com.laisiqi.operator;

//键盘录入一个正整数 x ，判断该整数是否为一个质数。

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("键盘录入一个正整数,判断它是否是质数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                flag = false;

                break;

            }



        }

        if (flag){

            System.out.println(number + " is a prime number");

        }else{

         System.out.println(number + " is not a prime number");
             }
    }

}