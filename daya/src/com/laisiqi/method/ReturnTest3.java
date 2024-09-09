package com.laisiqi.method;

import java.util.Scanner;

//键盘录入两个圆的半径（整数），比较两个圆的面积。
public class ReturnTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个圆半径");
        int r1 = sc.nextInt();
        System.out.println("请输入第二个圆半径");
        int r2 = sc.nextInt();
        double area1 = area(r1);
        double area2 = area(r2);

        if(area1 > area2){

            System.out.println("第一个圆面积大，为：" + area1);


        }else {


            System.out.println("第二个圆面积大，为：" + area2);
        }



    }

    public static double area(int r){

        double area = 3.14 * r * r;
        return area;




    }




}
