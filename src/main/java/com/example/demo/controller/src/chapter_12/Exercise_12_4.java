package com.example.demo.controller.src.chapter_12;


//[12-4] 아래의 메서드는 두 개의 ArrayList를 매개변수로 받아서,
//       하나의 새로운 ArrayList로 병합하는 메서드이다. 이를 제너릭 메서드로
//       변경 하시오.

import java.util.ArrayList;

class Product {
}

public class Exercise_12_4 {

    public static <T extends Product> ArrayList<T> merge(ArrayList<T> list, ArrayList<T> list2) {

            ArrayList<T> newList = new ArrayList<>(list);
            newList.addAll(list2);
            return newList;

    }


    public static void main(String[] args) {



    }

}
