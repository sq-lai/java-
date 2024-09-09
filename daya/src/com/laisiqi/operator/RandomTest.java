package com.laisiqi.operator;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();
        //生成随机数
        int number = r.nextInt(100);
        System.out.println(number);

    }


}
