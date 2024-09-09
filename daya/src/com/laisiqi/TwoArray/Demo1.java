package com.laisiqi.TwoArray;

public class Demo1 {
    //二维数组练习
    public static void main(String[] args) {
        //静态初始化
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        //元素访问
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[0][1]);


        //元素遍历
        //外循环
        for (int i = 0; i < arr.length; i++) {
            //内循环
            for (int j = 0; j < arr[i].length; j++) {


                System.out.print(arr[i][j]);


            }

        }


        //动态初始化
        //3代表3个一维数组，5代表每个一维数组可以装5个元素
        int[][] arr2 = new int[3][5];

        //元素赋值

        arr2[0][0] = 1;

        //数组遍历

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                System.out.println(arr2[i][j]);
            }
        }


    }




}