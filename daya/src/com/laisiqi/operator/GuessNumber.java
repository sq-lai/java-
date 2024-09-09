package com.laisiqi.operator;


import java.util.Random;
import java.util.Scanner;

//程序自动生成一个1-100之间的随机数，在代码中使用键盘录入去猜出这个数字是多少？
public class GuessNumber {

    public static void main(String[] args) {

        System.out.println("程序自动生成一个1-100之间的随机数，在代码中使用键盘录入去猜出这个数字是多少？");

        Random random = new Random();

        int number = random.nextInt(100) + 1;//因为100它生成的数字是0-99;

        Scanner sr = new Scanner(System.in);



        while (true){
            //因为要一直猜，要输入数字，所以要把这个代码放在循环里面！！！
            int guessNumber = sr.nextInt();

            if (guessNumber == number){

                System.out.println("恭喜你猜对了");

                break;

            }else if (guessNumber > number){


                System.out.println("猜的数字大了一点");


            }else if (guessNumber < number){


                System.out.println("猜的数字小了一点");


            }






        }



    }


}
