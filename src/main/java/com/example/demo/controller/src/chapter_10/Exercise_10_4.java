package com.example.demo.controller.src.chapter_10;

// 화면으로부터 날짜를 "2007/05/11" 의 형태로 입력받아서, 무슨 요일인지 출력하는
// 프로그램을 작성하시오.
// 단, 입력된 날짜의 형식이 잘못된 경우 메세지를 보여주고 다시 입력받아야 한다.

import com.sun.tools.jconsole.JConsoleContext;

import java.io.Console;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_10_4 {


    public static void main(String[] args) {

        String pattern = "yyyy/MM/dd";
        String pattern2 = "입력하신 날짜는 E요일 입니다."; //'E'는 일~토 중의 하나가 된다.

        DateFormat df = new SimpleDateFormat(pattern);
        DateFormat df2 = new SimpleDateFormat(pattern2);

        Scanner scanner = new Scanner(System.in);

        Date inDate = null;

        do {

            System.out.println("날짜를 " + pattern + "의 형태로 입력해 주세요.(입력 예:2007/05/11)");

            try {
                System.out.println(">>");
                inDate =  df.parse(scanner.nextLine()); // 입력받은 날짜르 date으로 변환
                break; // 예외가 발생하면 이 문장은 수행되지 않는다.
            } catch (Exception e) {
            }


        } while (true);

        System.out.println(df2.format(inDate));

    }


}
