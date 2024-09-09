package com.laisiqi.arraylist;

import com.laisiqi.objecttest.Student;//同一级文件夹下不用导包操作，当前工作空间的其他文件夹自己封装的类需要导包操作！！！

import java.util.ArrayList;

//创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
//测试类
public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Student s1 = new Student("张三",18,0);
        Student s2 = new Student("李四",20,1);
        Student s3 = new Student("王五",24,2);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + " ," + stu.getAge());



        }
    }
}
