package com.laisiqi.javatest;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 面包机的个数
        int[] a = new int[n];  // 制作面包a的时间
        int[] b = new int[n];  // 制作面包b的时间

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // 初始化最小时间为一个较大的数值
        int minTime = Integer.MAX_VALUE;

        // 遍历所有的组合情况
        for (int i = 0; i < n; i++) {
            // 同一台面包机制作两种面包的时间
            minTime = Math.min(minTime, a[i] + b[i]);
        }

        // 找出不同面包机制作面包a和面包b的最小最大值
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    minTime = Math.min(minTime, Math.max(a[i], b[j]));
                }
            }
        }

        // 输出最少花费的时间
        System.out.println(minTime);

        sc.close();
    }
}
