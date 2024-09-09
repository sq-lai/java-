package com.laisiqi.Stringtest;
//定义一个方法，把 **int 数组中的数据**按照指定的格式拼接成**一个字符串**返回，调用该方法，
//
//	并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：**[1, 2, 3]**，**看到这个我要明白这个就是字符串里面的内容！！！**
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = arrToString(arr);//自己定义的数组变成字符串
        System.out.println(str);
    }
    public static String arrToString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                s = s + arr[i];
            }else {

                s = s + arr[i] + ",";
            }
        }
        s = s + "]";

        return s;


    }

}
