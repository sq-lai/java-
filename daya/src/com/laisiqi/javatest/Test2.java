package com.laisiqi.javatest;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //随便试试
        // 输入n和x
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // 输入序列元素并计算总和
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 计算总和对x的余数
        int remainder = sum % x;

        // 如果总和已经是x的倍数，不需要任何操作
        if (remainder == 0) {
            System.out.println(0);
            return;
        }

        // 尝试找到最小的操作次数
        boolean canRemove = false;
        for (int i = 0; i < n; i++) {
            // 如果删除arr[i]能使余数为0
            if ((sum - arr[i]) % x == 0) {
                System.out.println(1);
                return;
            }
        }

        // 如果不能通过删除直接消除余数，检查加法操作
        for (int i = 0; i < n; i++) {
            // 如果可以通过增加某个元素使余数为0
            if ((sum + 1 - arr[i]) % x == 0) {
                System.out.println(2);
                return;
            }
        }

        // 如果没有找到更优解，输出2
        System.out.println(2);
        sc.close();
    }
}
