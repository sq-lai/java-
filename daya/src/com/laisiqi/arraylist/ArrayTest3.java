package com.laisiqi.arraylist;

import java.util.ArrayList;

//1，main方法中定义一个集合，存入三个用户对象。
//
//   用户属性为：id，username，password
//
//2，要求：定义一个方法，根据id查找对应的学生信息。
//
//   如果存在，返回索引
//
//   如果不存在，返回-1
public class ArrayTest3 {
    public static void main(String[] args) {

        ArrayList<Student2> list = new ArrayList<>();
        Student2 s1 = new Student2("heima001", "zhangsan", "123456");
        Student2 s2 = new Student2("heima002", "lisi", "1234");
        Student2 s3 = new Student2("heima002", "lisi", "1234");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int index = getIndex(list,"heima001");
        System.out.println(index);
    }
    private static int getIndex(ArrayList<Student2> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student2 s1 = list.get(i);
            String id1 = s1.getId();
            if (id1.equals(id)) {
                return i;
            }
        }

        return -1;
    }
}
