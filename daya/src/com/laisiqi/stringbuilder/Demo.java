package com.laisiqi.stringbuilder;
//基础练习，掌握
public class Demo {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);

        sb.append("2").append("343").append("456");
        System.out.println(sb);

        sb.reverse();

        int len = sb.length();
        System.out.println(len);
        //相当于把StringBuilder类变换为String类
        String str = sb.toString();
        System.out.println(str);
        }



}
