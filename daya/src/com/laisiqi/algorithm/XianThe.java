package com.laisiqi.algorithm;

import java.util.Arrays;

//选择排序
public class XianThe {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,4,6,9};
        //选择排序的思想，从数组的0索引开始固定，与后面的相互比较，小的方0。一轮过后索引固定下一个来这么做。
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
