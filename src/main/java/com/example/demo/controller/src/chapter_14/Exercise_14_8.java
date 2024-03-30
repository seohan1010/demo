package com.example.demo.controller.src.chapter_14;

// [14-8] 다음은 불합격(150점 미만)한 학생의 수를 남자와 여자로 구별하여 출력하는 프로그램이다.
//        (1)에 알맞은 코드를 넣어 완성하시오.


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{





    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student() {
    }

    public Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getHak() {
        return hak;
    }

    public void setHak(int hak) {
        this.hak = hak;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }







    //groupBy()에서 사용
    enum Level {HIGH,MID,LOW};


}


public class Exercise_14_8 {


    public static void main(String[] args) {




        Student[] stuArr = {
                new Student("나자바",true,1,1,300),
                new Student("김지미",true,1,1,250),
                new Student("김자바",true,1,1,200),
                new Student("이지미",false,1,2,150),
                new Student("남자바",true,1,2,100),
                new Student("안지미",false,1,2,50),
                new Student("황지미",false,1,3,100),
                new Student("강지미",false,1,3,150),
                new Student("이자바",true,1,3,200),
                new Student("나자바",true,2,1,300),
                new Student("이지미",false,2,2,150),
                new Student("남자바",true,2,2,100),
                new Student("안지미",false,2,2,50),
                new Student("황지미",false,2,3,100),
                new Student("강지미",false,2,3,150),
                new Student("이자바",true,2,3,200)
        };


        Map<Boolean, Map<Boolean, Long>> failedStuBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Student::isMale,Collectors.partitioningBy(s->s.getScore() < 150,Collectors.counting())));


        long failedMaleStuNum = failedStuBySex.get(true).get(true);
        long failedFemaleStuNum = failedStuBySex.get(false).get(true);


        System.out.println("불합격[남자]:"+failedMaleStuNum+"명");
        System.out.println("불합격[여자]:"+failedFemaleStuNum+"명");






    }


}
