package com.example.demo.controller.src.chapter_13;


public class Exercise_13_5 {


    public static void main(String[] args) throws Exception {

        Thread3 th1 = new Thread3();

        th1.start();

        try {

            Thread.sleep(5 * 1000);

        } catch (Exception e) {
            throw new Exception("꽝");
        }

    } // main


}


class Thread3 extends Thread {

    public void run() {


        for (int i = 0; i < 10; i++) {

            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    } // run

}