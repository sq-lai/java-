package com.laisiqi.operator;

public class Transform {
    public static void main(String[] args) {
        int i = 10;
        long l = 10L;
        System.out.println(i+l);
        double d = 3.14;
        System.out.println(i+l+d);
        //java的语言底层是隐式转换，数据类型小的在和大的运算的时候会先变成大的来进行计算！！！

        //强制类型转换,目标数据类型 变量名 = （目标数据类型）被强转的数据；
        int c = (int) d;
        System.out.println(c);

        //字符a代表97，A代表65

        char k = 'a';
        System.out.println(k);

        int p = k + 10;
        System.out.println(p);

        //三元表达式:其值要么被输出，要么被赋值。

        int num1 = 20;
        int num2 = 30;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);

    }


}
