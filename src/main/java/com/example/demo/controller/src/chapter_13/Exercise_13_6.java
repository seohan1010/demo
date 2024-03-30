package com.example.demo.controller.src.chapter_13;


public class Exercise_13_6 {


    public static void main(String[] args) throws Exception {


        Thread4  th1 = new Thread4();

        th1.setDaemon(true);
        th1.start();

        try{
                th1.sleep(5*1000);
        }catch(Exception e){
            throw new Exception("꽝");
        }


    }


}



class Thread4 extends  Thread{


    public void run(){


        for(int i=0;i < 10;i++){


            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}


        }


    } // run



}



