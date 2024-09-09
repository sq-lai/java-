package com.laisiqi.array;

public class DemoLearn1 {

    public static void main(String[] args) {

        //数组元素访问
        int[] a = {1,2,3,4,5};
        int number = a[3];
        System.out.println(number);
        System.out.println(a[3]);

        a[3] = 10;

        System.out.println(a[3]);

        //数组的遍历,遍历需要长度length

        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);


        }


    }


}
