package com.laisiqi.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年mm月dd天 hh:mm:ss");
        sdf.format(date);
        System.out.println(sdf.format(date));

        String str = "2001年01月23天 11:12:20";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年mm月dd天 hh:mm:ss");
        Date d = sdf1.parse(str);
        System.out.println(d);
    }
}
