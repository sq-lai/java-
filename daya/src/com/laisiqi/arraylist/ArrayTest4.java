package com.laisiqi.arraylist;

import java.util.ArrayList;

// /* 需求：
//        1，main方法中定义一个集合，存入三个用户对象。
//        用户属性为：id，username，password
//        2，要求：定义一个方法，根据id查找对应的学生信息。
//        如果存在，返回true
//        如果不存在，返回false*/
public class ArrayTest4 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        Student2 s1 = new Student2("123","adf","23124124");
        Student2 s2 = new Student2("1234","adfe","23124dw124");
        Student2 s3 = new Student2("123456","adf423","231241244324");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        //定义的方法
        boolean results = contain(list,"123");
        System.out.println(results);
    }
    public static boolean contain(ArrayList<Student2> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            Student2 s = list.get(i);
            String uid = s.getId();
            if (str.equals(uid)) {
                return true;
            }


        }
        return false;
    }

}
