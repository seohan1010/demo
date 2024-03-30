package com.example.demo.controller.src.chapter_11;


import java.util.*;

class Student5 implements Comparable {

    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    int schoolRank;
    int classRank;


    Student5(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = kor + eng + math;

    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public int compareTo(Object o) {
        if (o instanceof Student5) {
            Student5 tmp = (Student5) o;

            return tmp.total - this.total;

        } else {
            return -1;
        }
    }

    public String toString() {

        return name +
                ", " + ban +
                ", " + no +
                ", " + kor +
                ", " + eng +
                ", " + math +
                ", " + getTotal() +
                ", " + getAverage() +
                ", " + schoolRank +
                ", " + classRank
                ;
    }


}// class Student5


// 반에서 점수에 따라서 반의 등수를 매긴다.
class ClassTotalComparator implements Comparator {

    public int compare(Object o1, Object o2) {


            Student5 stu1 = (Student5) o1;
            Student5 stu2 = (Student5) o2;

            int result = stu1.ban - stu2.ban;

            // result가 0이면 같은반 이라는 의미이다.
            if (result == 0)
                result = stu1.total - stu2.total; // 총점(total) 기준 정렬

            return result;

    }

}

public class Exercise_11_9 {

    public static void calculateClassRank(List list) {

        Collections.sort(list, new ClassTotalComparator());

        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();


        for (int i = 0,n=0; i < length; i++,n++) {
            Student5 stu = (Student5) list.get(i);

            // 1.1 반이 달라지면, (ban과 prevBan이 다르면)
                //이전 등수(prevRank)와 이전 총점을 초기화 한다.
            if (stu.ban != prevBan) {

                prevRank = -1;
                prevTotal = -1;
                n = 0;

            }

            // 1.2 총점(total)이 이전 총점(prevTotal) 과 같으면
            // 이전 등수(prevRank)를 등수(classRank)로 한다.
            if(stu.total == prevTotal){
                stu.classRank = prevRank;
            }else{

                // 1.3 총점이 서로 다르면,
                //     등수 (classRank)의 값을 알맞게 계산해서 저장한다.
                //     이전에 동점자 였다면, 그 다음 등수는 동점자의 수를 고려해야 한다.
                stu.classRank = n+1;
            }

            // 1.4 현재 반과 총점과 등수를 이전 반 (prevBan),
                    //이전 총점 (prevTotal), 이전 등수 (prevRank)에 저장한다.

                prevBan = stu.ban;
                prevRank = stu.classRank;
                prevTotal = stu.total;


        }


    }// public static void calculateClassRank(List list){}

    public static void calculateSchoolRank(List list) {

           Collections.sort(list);

           int prevRank = -1;
           int prevTotal = -1;
           int length = list.size();

           for(int i=0;i < length;i++){

               Student5 s = (Student5)list.get(i);

               if(s.total == prevTotal){
                   s.schoolRank = prevRank;
               }else{
                   s.schoolRank = i +1;
               }

               prevRank = s.schoolRank;
               prevTotal = s.total;
           } // for

    }

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new Student5("이자바", 2, 1, 70, 90, 70));
        list.add(new Student5("안자바", 2, 2, 60, 100, 80));
        list.add(new Student5("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student5("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student5("김자바", 1, 2, 80, 80, 90));

        calculateClassRank(list);
        calculateSchoolRank(list);

        Iterator iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }

}
