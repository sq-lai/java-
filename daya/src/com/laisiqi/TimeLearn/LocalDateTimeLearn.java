package com.laisiqi.TimeLearn;

import java.time.LocalDateTime;

public class LocalDateTimeLearn {
    public static void main(String[] args) {
        LocalDateTime ldl = LocalDateTime.now();
        System.out.println(ldl);

        //get获得
        int year = ldl.getYear();
        int month = ldl.getMonthValue();
        int day = ldl.getDayOfMonth();
        int hour = ldl.getHour();
        int minute = ldl.getMinute();
        int second = ldl.getSecond();
        System.out.println(year);
        System.out.println(month);

        //with修改,并且是不可变对象
        LocalDateTime ldt2 = ldl.withYear(2023);
        System.out.println(ldt2);
        LocalDateTime ldt3 = ldl.withMonth(12);
        System.out.println(ldt3);

        //加减
        LocalDateTime ldt4 = ldl.plusYears(2);
        System.out.println(ldt4);
        LocalDateTime ldt5 = ldl.minusMonths(2);
        System.out.println(ldt5);


        //创建指定日期时间的对象
        LocalDateTime ldt6 = LocalDateTime.of(2029,12,12,12,21,21,12);
        System.out.println(ldt6);





    }
}
