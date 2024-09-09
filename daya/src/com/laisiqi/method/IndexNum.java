package com.laisiqi.method;
//定义一个方法获取数字，在数组中的索引位置，将结果返回给调用处，如果有重复的，只要获取第一个即可。
//说白了就是给一个数组和索引，给我此处的数字。
public class IndexNum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int number = GetIndexNum(arr,1);

        System.out.println(number);
    }


    public static int GetIndexNum(int[] arr, int num){


        for(int i=0;i<arr.length;i++){

            if(i == num){

                return arr[i];

            }



        }

    return -1;





    }

}
