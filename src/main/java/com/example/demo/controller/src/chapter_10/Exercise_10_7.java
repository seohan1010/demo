package com.example.demo.controller.src.chapter_10;


// 10 - 7 2016년 12월 네번째 화요일의 날짜를 아래의 실행결과와 같은 형식으로 출력하시오.
// 2016 - 12 - 27

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.dayOfWeekInMonth;

public class Exercise_10_7 {

    public static void main(String[] args) {

    LocalDate date = LocalDate.of(2016,12,1);
        System.out.println(date.with(dayOfWeekInMonth(4, DayOfWeek.TUESDAY)));

    }

}

