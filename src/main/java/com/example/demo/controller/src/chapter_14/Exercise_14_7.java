package com.example.demo.controller.src.chapter_14;


// [14-7]임의의 로또번호(1~45)를 정렬하여 출력하시오
//
// 1
// 20
// 25
// 33
// 35
// 42

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_14_7 {

    public static void main(String[] args) {


    List list =lottery();

        Collections.sort(list);
        System.out.println("list = " + list);
    
    }


    public static List lottery(){
        List list = new ArrayList(6);

        while(true) {

            int num = (int) (Math.random() * 45);

            if(num!=0){
                list.add(num);
                System.out.println("num = " + num);
            }
            if(list.size()==6)break;

        }
        return list;



    }

}
