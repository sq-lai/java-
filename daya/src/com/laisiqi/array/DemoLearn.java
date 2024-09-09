package com.laisiqi.array;


//数组的静态初始化,也就是数组的定义生成静态的方法
public class DemoLearn {

    public static void main(String[] args) {

        //两种定义方式,new代表在内存开辟了新的地址。
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] b = {1,2,3,4,5,6,7,8,9,10};

        double[] c = new double[]{1,2,3,4,5,6,7,8,9,10};
        double[] d = {1,2,3,4,5,6,7,8,9,10};

        //数组的地址值打印

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }


}
