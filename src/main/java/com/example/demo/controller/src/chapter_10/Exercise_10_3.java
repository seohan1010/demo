package com.example.demo.controller.src.chapter_10;


// 문자열 "123,456,789.5"를 소수점 첫 번째 자리에서 반올림하고,
// 그 값을 만 단위마다  콤마(,)로 구분해서 출력하시오


import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise_10_3 {

    public static void main(String[] args) {

        String data = "123,456,789.5";

        DecimalFormat df = new DecimalFormat(); // 변환할 문자열의 형식을 지정
        DecimalFormat df2 = new DecimalFormat();

        try{
            Number num = df.parse(data);
            double d = num.doubleValue();
            System.out.println("data:"+data);
            System.out.println("반올림:"+Math.round(d));
            System.out.println("만단위:"+df2.format(d));

        }catch(Exception e){}
    }


}
