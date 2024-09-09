package com.laisiqi.algorithm;

import java.util.Arrays;

//冒泡排序练习
public class MaoPao {
    public static void main(String[] args) {
        //先定义一个数组
        int[] arr = {2,6,3,8,2};
        //使用冒泡排序算法,两两对比所以数组长度减少1
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
