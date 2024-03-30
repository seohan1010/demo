package com.example.demo.controller.src.chapter_14;


// [14-2] 메서드를 람다식으로 변환하여 아래의 표를 완성하시오
// int max(int a, int b){
//  return a < b ? a : b ;             (int a,int b) -> a > b ? a : b
// }

//int printVar(String name, int i){     (String name, int i)-> System.out.println(name+"="+i)
// System.out.println(name+"="+i);
// }

// int square(int x){                  i->x
// return x * x;
// }

//int roll(){
// return (int)(Math.random()*6);     ()-> (int)(Math.random()*6)
// }

//int sumArr(int[] arr){
// int sum = 0 ;
// for(int i: arr){       (arr) -> { int sum = 0; for(int i: arr)sum+=i;return sum;}
//  sum+=i
// }
// return sum
// }

// int[] emptyArr(){
// return new int[]{};      ()-> new int[]{}
// }


import java.util.function.Function;

interface Test{
    int sumArr(int[] arr);
}

public class Exercise_14_1 {

    public static void main(String[] args) {
            Test t = (arr)->{int sum=0;for(int i : arr)sum+=i;return sum;};
    }

}
