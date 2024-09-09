package com.laisiqi.array;

//需求：求数组中的最大值
//定义数组求最大值：33,5,22,44,55
//有点类似于冒泡的排序，浮出来

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55,100,78,59};
        int max = arr[0];
        //没必要和自己再比较一次
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){

                max = arr[i];




            }





        }


        System.out.println("数组的最大值为：" + max);


    }






}
