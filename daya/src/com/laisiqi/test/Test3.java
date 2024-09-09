package com.laisiqi.test;

import java.util.Random;

public class Test3 {


 /*   需求：
            定义方法实现随机产生一个5位的验证码
            验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位是数字

 */
 public static void main(String[] args) {
        char[] arr = new char[52];//存储26个字母的大小写正好
        String result = "";//String是S大写！

        for (int i = 0; i < arr.length; i++) {

            if(i <= 25){

                arr[i] = (char) (97 + i);//定义了小写的字母,a-z

            }else {

                arr[i] = (char) (65 + i - 26);

            }




        }
         Random src = new Random();



         for(int j = 0; j < 4; j++){

            int rand = src.nextInt(arr.length);//这一行代码要放里面每次的数才会变
            result = result + arr[rand];

        }

        int num = src.nextInt(10);

            result = result + num;

            System.out.println(result);

 }






}
