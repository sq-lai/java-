package com.laisiqi.anonymousClass;
//测试类
public class Test {
    public static void main(String[] args) {
        Swimming cat = new Swimming() {
            @Override
            public void swim() {
                System.out.println("猫不会游泳");
            }
        };
        cat.swim();

    }
}
