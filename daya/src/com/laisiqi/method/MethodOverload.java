package com.laisiqi.method;

//需求：使用方法重载的思想，设计比较两个整数是否相同的方法，兼容全整数类型（byte,short,int,long）
public class MethodOverload {
    public static void main(String[] args) {

        System.out.println(compare(10,20));
        System.out.println(compare(10,20));
        System.out.println(compare(10,20));
        System.out.println(compare(10L,20L));



    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {

        return a == b;
    }

    public static boolean compare(short a, short b) {

        return a == b;
    }

    public static boolean compare(long a, long b) {

        return a == b;
    }





}
