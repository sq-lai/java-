package com.laisiqi.Stringtest;

import java.util.Scanner;

//已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
public class Test1 {
    public static void main(String[] args) {
        String rightUsername = "赖思琦";
        String rightPassword = "123456";

        for (int i = 0; i < 3; i++) {
            Scanner sr = new Scanner(System.in);
            System.out.println("请输入您的用户名");
            String username = sr.next();
            System.out.println("请输入您的密码");
            String password = sr.next();

            if (username.equals(rightUsername) && password.equals(rightPassword)) {

                System.out.println("登录成功");
                break;


            }else{

                if(i == 2){

                    System.out.println("账户被锁定");
                }else{

                    System.out.println("用户名或密码错误,还剩下" + (2 - i));


                }



            }






        }

    }
}
