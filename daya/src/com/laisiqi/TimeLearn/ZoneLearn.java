package com.laisiqi.TimeLearn;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneLearn {
    public static void main(String[] args) {
        ZoneId zoneid = ZoneId.systemDefault();
        System.out.println(zoneid);

        //获得java支持的所有的时区id
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zoneid1 = ZoneId.of("Asia/Shanghai");

        //ZoneDateTime
        ZonedDateTime now = ZonedDateTime.now(zoneid);
        System.out.println(now);

        //世界标准时间
        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);

        
    }
}
