package com.laisiqi.array;
/*
需求：定义一个数组，存储1,2,3,4,5

遍历数组得到每一个元素，求数组里面所有的数据和

 */

public class ArrayTest1 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {


            sum += a[i];

        }

        System.out.println(sum);

    }









}
