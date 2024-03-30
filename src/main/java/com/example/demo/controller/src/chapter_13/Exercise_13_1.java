package com.example.demo.controller.src.chapter_13;



// [13-1] 쓰레드를 구현하는 방법에는 Thread클래스로부터 상속받은 것과 Runnable인터페이스를 구현하는 것 두 가지가 있는데
//        , 다음의 코드는 Thread클래스를 상속받아서, 쓰레드를 구현한 것이다. 이 코드를 Runnable 인터페이스를
//        구현하도록 변경하시오
//


public class Exercise_13_1 {

    public static void main(String[] args) {

         Thread1 th1 = new Thread1();
         th1.start();

    }

}


class Thread1 extends Thread{

    public void run(){
        for(int i=0;i < 300;i++){
            System.out.println('-');
        }
    }




}
