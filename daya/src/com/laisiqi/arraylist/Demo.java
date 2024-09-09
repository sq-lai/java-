package com.laisiqi.arraylist;

import java.util.ArrayList;

//ArrayList基础练习
public class Demo {
    public static void main(String[] args) {
        //对象创建
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        //删除元素
        boolean results = list.remove("D");
        System.out.println(results);
        String str = list.remove(0);
        System.out.println(str);
        //修改元素
        String str2 = list.set(0,"F");
        System.out.println(str2);
        //查询元素
        String str3 = list.get(1);
        System.out.println(str3);

        //元素遍历,提供了size方法，方法一般是加（）的
        for (int i = 0; i < list.size(); i++) {
            String str4 = list.get(i);
            System.out.println(str4);
        }
    }
}
