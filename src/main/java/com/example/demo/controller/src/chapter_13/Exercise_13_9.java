package com.example.demo.controller.src.chapter_13;



//[13-9] 다음은 사용자의 입력을 출력하고 종료하는 프로그램을 작성한 것으로, 10초 동안 입력이 없으면
//       자동종료 되어야 한다. 그러나 실행결과를 보면, 사용자의 입력이 10초 안에 이루어졌음에도
//       불구하고 프로그램이 즉시 종료되지 않는다. 사용자로부터 입력받는 즉시 프로그램이 수정되도록
//       하시오.

import javax.swing.*;

public class Exercise_13_9 {

    public static void main(String[] args) {

         Exercise13_19_1 th1 = new Exercise13_19_1();
         th1.start();

         String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
         System.out.println("입력하신 값으 "+input+" 입니다.");
         th1.interrupt(); // 쓰레드에게 작업을 멈추라고 요청한다.

    }

}


class Exercise13_19_1 extends Thread{


    public void run(){


        int i = 10;

        while(i!=0 && !isInterrupted()){
            System.out.println(i--);
            try{
                Thread.sleep(1000); // 1초 지연
            }catch(InterruptedException e){
                interrupt();
            }
        }


    } // run


}
