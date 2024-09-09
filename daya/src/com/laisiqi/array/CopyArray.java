package com.laisiqi.array;
//定义一个方法copyOfRange(int[] arr,int form,int to)
//将数组从索引from开始to结束不包括to中的元素复制到新的数组里面去，将新的数组返回。
public class CopyArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] newArr = copyArray(arr,2,5);

        for (int i = 0; i < newArr.length; i++) {

            System.out.println(newArr[i]);
        }
    }

    public static int[] copyArray(int[] array, int start, int end) {

        int[] newarray = new int[end - start];

        int j = 0;

        for (int i = start; i < end; i++) {

            newarray[j++] = array[i];


        }

        return newarray;



    }




}
