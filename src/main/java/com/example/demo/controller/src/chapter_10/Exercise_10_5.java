package com.example.demo.controller.src.chapter_10;


// 다음과 같이 정의된 메서드를 작성하고 테스트 하시오.
// 메서드명 : getDayDiff
// 기   능 : yyyymmdd 형식의 두 문자열을 넘겨 받으면 두 날짜의 차이를 일(day)단위로
//          반환한다. 단, 첫 번째 날짜 빼기 두 번째 날짜의 결과를 반환한다.
//          만일 주어진 문자열이 유효하지 않으면은 0을 반환한다.

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise_10_5 {

    private static int getDayDiff(String firstDate, String secondDate){

        int diff = 0;
        try{
            int year1 = Integer.parseInt(firstDate.substring(0,4));
            int month1 = Integer.parseInt(firstDate.substring(4,6)) -1;
            int day1 = Integer.parseInt(firstDate.substring(6,8));

            int year2 = Integer.parseInt(secondDate.substring(0,4));
            int month2 = Integer.parseInt(secondDate.substring(4,6))-1;
            int day2 = Integer.parseInt(secondDate.substring(6,8));

            Calendar date1 = Calendar.getInstance();
            Calendar date2 = Calendar.getInstance();

            date1.set(year1,month1,day1);
            date2.set(year2,month2,day2);

            diff = (int)((date1.getTimeInMillis() - date2.getTimeInMillis())/(24*60*60*1000));


        }catch(Exception e){
             diff = 0; // substring(), parseInt() 에서 예외가 발생하면 0을 반환한다.
        }
            return diff;
    }


    public static void main(String[] args) {

        System.out.println(getDayDiff("20010103","20010101"));

    }
}