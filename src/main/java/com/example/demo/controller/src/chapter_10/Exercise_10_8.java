package com.example.demo.controller.src.chapter_10;


// [10-8] 서울과 뉴욕간의 시차가 계산하여 출력하시오 얼마인지

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise_10_8 {

    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now();
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime zdtNY = ZonedDateTime.now().withZoneSameInstant(nyId);

        System.out.println(zdt);
        System.out.println(zdtNY);

        long sec1 = zdt.getOffset().getTotalSeconds();
        long sec2 = zdtNY.getOffset().getTotalSeconds();
        long diff = (sec1 - sec2)/3600;

        System.out.println("sec1="+sec1);
        System.out.println("sec2="+sec2);
        System.out.println("diff="+diff);

    }

}


//        2016-01-28T23:01:00.136+09:00[Asia/Seoul]
//        2016-01-28T09:01:00.138-05:00[America/New_York]
//        sec1=32400
//        sec2=-18000
//        diff=14 hrs
