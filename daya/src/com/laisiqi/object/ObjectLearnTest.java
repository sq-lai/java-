package com.laisiqi.object;
//测试类
public class ObjectLearnTest {

    public static void main(String[] args) {

        ObjectLearn obj = new ObjectLearn();//实例化对象！！创造了这个对象obj出来了

        obj.age = 23;
        obj.name = "小明";

        System.out.println(obj.age);
        System.out.println(obj.name);

        obj.doHomework();
        obj.study();

    }

}
