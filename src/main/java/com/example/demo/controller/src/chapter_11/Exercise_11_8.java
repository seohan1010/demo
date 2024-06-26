package com.example.demo.controller.src.chapter_11;

// [11-8] 문제 11-7의 Student3클래스에 총점(total)과 전교등수(schoolRank)를 저장하기
//        위한 인스턴스 변수를 추가하였다. Student3 클래스의 기본정렬을 이름 (name)이 아닌
//        총점(total)을 기준으로 한 내림차순으로 변경한 다음, 총점을 기준으로 각 학생의
//        전교등수를 계산하고, 전교 등수를 기준으로 오름차순 정렬하여 출력하시오. 


import java.util.*;


class Student4 implements Comparable {

    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total; // 총점;
    int schoolRank; // 전교등수

    Student4(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor + eng + math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }


    // 이렇게 정렬기준만 작성해주면은 나머지는 알아서 구현해 주는거 같다.
    public int compareTo(Object o) {
        if (o instanceof Student4) {
            Student4 tmp = (Student4) o;

            return tmp.total - this.total; // 총점 기준 (내림차순)으로 정렬한다.
        } else {
            return -1;
        }
    }


    public String toString() {
        return name
                + ", " + ban
                + ", " + no
                + ", " + kor
                + ", " + eng
                + ", " + math
                + ", " + getTotal()
                + ", " + getAverage()
                + ", " + schoolRank
                ;
    }


}// Class Student4


public class Exercise_11_8 {


    public static void calculateSchoolRank(List list) {
        Collections.sort(list);

        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        // 1. 반복문을 이용해서 list에 저장된 Student4 객체를 하나씩 읽는다.

        for (int i = 0; i < length; i++) {
            Student4 s = (Student4) list.get(i);

            // 1.1 총점 (total)이 이전 총점(prevTotal)과 같으면 이전 등수
            //     (prevRank)를 등수 (schoolRank)로 한다.
            if (s.total == prevTotal) {
                s.schoolRank = prevRank;
            } else {

                // 1.2 총점이 서로 다르면, 등수 (schoolRank)의 값을 알맞게 계산해서 저장한다.
                //     이전에 동점자였다면, 그 다음 등수는 동점자의 수를 고려해야 한다.
                s.schoolRank = i + 1;
            }
            // 1.3현재 총점과 등수를 이전총점(prevTotal)과 이전등수 (prevRank)에 저장한다.

            prevRank = s.schoolRank;
            prevTotal = s.total;

        }//for

    }

    public static void main(String[] args) {


    ArrayList list = new ArrayList();
    list.add(new Student4("이자바",2,1,70,90,70));
    list.add(new Student4("안자바",2,2,60,100,80));
    list.add(new Student4("홍길동",1,3,100,100,100));
    list.add(new Student4("남궁성",1,1,90,70,80));
    list.add(new Student4("김자바",1,2,80,80,90));

    calculateSchoolRank(list);

    Iterator it = list.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }





    } // main의 끝

}