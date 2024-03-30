package com.example.demo.controller.src.chapter_14;


// [14-5] 문자열 배열 strArr의 모든 문자열의 길이를 더한 결과를 출력하시오.



@FunctionalInterface
interface Sum{
    int sum(String[] str);
}

public class Exercise_14_5 {

    public static void main(String[] args) {


        String[] arr = {"aaa","bb","c","dddd"};

        Sum sum = (str)->{
            int added = 0;
            for(int i=0;i<str.length;i++){

                added+=str[i].length();


            }
        return added;
        };


        System.out.println("sum.sum(arr) = " + sum.sum(arr));

    }

}
