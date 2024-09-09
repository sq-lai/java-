package com.laisiqi.arraylist;

import java.util.ArrayList;

//创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //遍历每一个元素里面的
        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){


                System.out.println(list.get(i));
            }else {

                System.out.println(list.get(i) + ",");
            }
        }

        System.out.println("]");
    }

}
