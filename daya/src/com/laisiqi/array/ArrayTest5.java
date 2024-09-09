package com.laisiqi.array;

/*
需求：生成10个1~100之间的随机数存入数组。

1）求出所有数据的和

2）求所有数据的平均数

3）统计有多少个数据比平均值小
 */

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        //存入
        for (int i = 0; i < arr.length; i++){
            int num = r.nextInt(100) + 1;
            arr[i] = num;

        }
        //求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++){

            sum += arr[i];

        }

        System.out.println("所有数据的和为：" + sum);
        //求出所有数据的平均数

        int average = sum / arr.length;
        System.out.println("所有数据的平均数为：" + average);

        //统计多少小于
        int flag = 0;

        for (int i = 0; i < arr.length; i++){

            if(arr[i] < average){

                flag++;



            }


        }

        System.out.println("总共有" + flag + "个数小于平均值");

    }






}
