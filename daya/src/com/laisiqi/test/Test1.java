package com.laisiqi.test;

import java.util.Scanner;

public class Test1 {
    /*
需求:(飞机票)

	机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。

	按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。

     */
    public static void main(String[] args) {
        System.out.println("请分别输入机票的原价、购买月份、是否头等舱（是1否0）");
        Scanner sc = new Scanner(System.in);
        double ticket = sc.nextInt();
        int month = sc.nextInt();
        int flag = sc.nextInt();

        //月份判断在主函数里面

        if (month >= 5 && month <= 10) {
            double  ticketChange = getTicket(ticket,flag,0.9,0.85);
            System.out.println("机票此时的价格为：" + ticketChange);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            double ticketChange = getTicket(ticket,flag,0.7,0.65);
            System.out.println("机票此时的价格为：" + ticketChange);
            
        }else {

            System.out.println("输入的月份有问题！！！");
        }


    }

    public  static double getTicket(double ticket,int flag,double discount1,double discount2){

        if(flag==1){
             ticket = ticket * discount1;

        }else {

             ticket = ticket * discount2;
        }

        return ticket;
    }




}

