package com.laisiqi.method;
//需求：设计一个方法用于获取数组中元素的最大值
public class GetMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};


        int maxNumber = getMax(arr);

        System.out.println("maxNumber = " + maxNumber);

    }

//求数组的最大值，一般都是先把数组的第一项定义为最大值，然后从第二项开始对比大小。
    public static int getMax(int[] arr) {

        int max = arr[0];

        for(int i = 1 ; i <arr.length ; i++) {

            if(arr[i] > max){

                max = arr[i];


            }



        }

        return(max);
    }
}
