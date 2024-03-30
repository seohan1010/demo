package com.example.demo.controller.src.chapter_10;


// 자신이 태어난 날부터 지금까지 며칠이 지났는지 계산해서 출력하시오.


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Exercise_10_6 {

    public static void main(String[] args) {

    LocalDate birthDay =LocalDate.of(2000,1,1); // 자신의 생일을 지정
    LocalDate now = LocalDate.now();

    long days  = birthDay.until(now, ChronoUnit.DAYS);

        System.out.println("birth day="+birthDay);
        System.out.println("today    ="+ now);
        System.out.println(days+" days");
        System.out.println(days*24);

    }

}

//birth day = 2000-01-01
//today     = 2016-01-29
//5872 days