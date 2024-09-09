package com.laisiqi.algorithm;

import java.util.Arrays;

//二分查找
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int i = binarySearch(arr, 11);
        System.out.println(i);
        System.out.println(Arrays.binarySearch(arr,3));
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else if (arr[mid] > target) {
                high = mid - 1;

            }
        }
        return -1;
    }

}
