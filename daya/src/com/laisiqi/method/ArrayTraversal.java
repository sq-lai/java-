package com.laisiqi.method;

//需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
public class ArrayTraversal {

    public static void main(String[] args) {
    /*
        System.out.println("aaa");
        System.out.print("aaa");
        System.out.print("aaa");
        System.out.println();

     */
        int[] arr = {11,22,33,44,55,66};

        printArray(arr);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0 ; i < arr.length ; i++) {

            if(arr[i] == arr[arr.length - 1]) {

                System.out.print(arr[i] + "]");
            }else {

                System.out.print(arr[i] + ", ");
            }

        }


    }
}
