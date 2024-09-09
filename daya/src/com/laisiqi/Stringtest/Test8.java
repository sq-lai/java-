package com.laisiqi.Stringtest;
//身份证的每一位都是有固定的含义：
//
//* 1、2位：省份
//* 3、4位：城市
//* 5、6位：区县
//* 7-14位：出生年、月、日
//* 15、16位：所在地派出所
//* 17位：性别（奇数男性，偶数女性）
//* 18位：个人信息码（随机产生）
//
//要求打印内容方式如下：
//
//	人物信息为：
//
//	出生年月日：XXXX年X月X日
//
//	性别为：男/女
public class Test8 {
    public static void main(String[] args) {
        String idCard = "430103200707102670";
        String year = idCard.substring(6, 10);
        String month = idCard.substring(10, 12);
        String day = idCard.substring(12, 14);
        System.out.println("人物信息为：");
        System.out.println(year + "年" + month + "月" + day + "日");

        char gender = idCard.charAt(16);

        int num = gender - 48;
        if(num % 2 == 0){
            System.out.println("性别为:女");
        }else{
            System.out.println("性别为:男");
        }
    }
}
