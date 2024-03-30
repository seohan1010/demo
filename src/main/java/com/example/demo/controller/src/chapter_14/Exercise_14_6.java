package com.example.demo.controller.src.chapter_14;

// [14-6] 문자열의 배열 strArr의 문자열 중에서 가장 긴 것의 길이를 출력하시오.


public class Exercise_14_6 {

    public static void main(String[] args) {

        String[] arr = {"aaa", "bb", "c", "dddd"};
        int length = arr.length;

        int top = 0;
        int tmp = 0;
        for (int i = 0; i < length; i++) {

                if(arr[i].length()>tmp){
                    top=arr[i].length();
                }
                tmp=arr[i].length();

        }
        System.out.println("top = " + top);

    }

}
