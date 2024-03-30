package others;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Test implements Comparable {

    int num ;

    Test(){}
    Test(int num){
        this.num = num;
    }

    public int compareTo(Object o){

        if(o instanceof Test){
            Test test = (Test)o;

            // 같으면 0을 반환 왼쪽이 더크면 1을 반환
            return (test.num - this.num)*-1;

        }else{
            return -1;
        }


    }

    public String toString(){
        return "num : " +num;
    }

}


public class Other2 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(new Test(5));
        list.add(new Test(3));
        list.add(new Test(4));
        list.add(new Test(1));
        list.add(new Test(2));


        // 아래의 코드를 작성해 주어야 정렬된 결과가 나온다.
        Collections.sort(list);

        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }


    }

}
