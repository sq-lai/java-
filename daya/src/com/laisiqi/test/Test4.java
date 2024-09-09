package com.laisiqi.test;

import java.util.Random;

public class Test4 {

    /*

    把一个数组中的元素复制到另一个新数组中去。,一模一样换个地方这种！！！
     */

    public static void main(String[] args) {

        Random rand = new Random();
        int index = rand.nextInt(10);
        //int[] arr = {1,2,3,4,5};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(10);
        }

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {

            System.out.println(newArr[i]);

        }



    }
}
