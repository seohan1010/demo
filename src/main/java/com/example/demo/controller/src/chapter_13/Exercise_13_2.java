package com.example.demo.controller.src.chapter_13;


//[13-2] 다음 코드의 실행결과로 옳은 것은


//a. 01021233454567689789  처럼 0부터 9까지의 숫자가 섞여서 출력된다
//b. 01234567890123456789  처럼 0부터 9까지의 숫자가 순서대로 출력된다 V
//c. IllegalThreadStateException 이 발생한다.

public class Exercise_13_2 {

    public static void main(String[] args) {


        Thread2 t1 = new Thread2();
        t1.run();

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }


    }

}


class Thread2 extends Thread {


    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

    }


}

