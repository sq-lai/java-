package com.laisiqi.TwoArray;

public class Test {

    /*
    求商场的每个季度的总营业额和全年的总营业额
    1 22,66,44
    2 77,33,88
    3 25,45,65
    4 11,66,99

     */
    public static void main(String[] args) {

        int[][] arr ={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        int sumYear = 0;
        for (int i = 0; i < arr.length; i++) {

            int[] arr1 = arr[i];
            int sum = getSum(arr1);
            System.out.println("第" + (i + 1) +"季度的总营业额为：" + sum);
            sumYear += sum;

        }


        System.out.println("全年的总营业额为：" + sumYear);


    }

    public static int getSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];



        }


        return sum;
    }


}
