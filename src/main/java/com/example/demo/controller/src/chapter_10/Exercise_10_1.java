package com.example.demo.controller.src.chapter_10;


// 10-1 Calendar 클래스와 SimpleDateFormat 클래스를 이용해서 2010년의 매월 2번 째
// 일요일의 날짜를 출력하시오.

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Exercise_10_1 {


    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 0, 1);

        for (int i = 0; i < 12; i++) {
            int weekday = calendar.get(Calendar.DAY_OF_WEEK); // 1일의 요일을 구한다.

            // 두번째 일요일은 1일의 요일에 따라 달라진다.
            int secondSunday = (weekday == 1) ? 8 : 16 - weekday;

            // 두 번째 일요일 (secondSunday)로 cal의 날짜 (DAY_OF_MONTH)를 바꾼다.
            calendar.set(Calendar.DAY_OF_MONTH, secondSunday);

            Date d = calendar.getTime(); // Calendar를 Date로 변환한다.
            System.out.println(new SimpleDateFormat("yyyy-MM-dd F번째 E요일입니다.").format(d));

            // 날짜를 다음달 1일로 변경한다.
            calendar.add(Calendar.MONTH, 1);
            calendar.set(Calendar.DAY_OF_MONTH, 1);

        }


    }

}
