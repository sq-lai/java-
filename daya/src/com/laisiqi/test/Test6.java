package com.laisiqi.test;

public class Test6 {
     /*
        某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
        规则如下：
            每位数加上5
            再对10求余，
            最后将所有数字反转，
            得到一串新数。
*/
     public static void main(String[] args) {
         //数组的思想来做
         int[] arr = {1,9,8,3};
         for (int i = 0; i < arr.length; i++) {

             arr[i] = arr[i] + 5;
             arr[i] = arr[i] % 10;

         }
        //相同类型用，隔开！！！
         for (int i = 0, j = arr.length - 1; i < j; i++, j--){

             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;

         }

         int number = 0;

         for (int i = 0; i < arr.length; i++) {

             number = number * 10 + arr[i];

         }
         System.out.println(number);







     }



}
