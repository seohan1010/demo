package com.example.demo.controller.src.chapter_12;

// [12-1] class Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은?
//        오류가 발생하는 문장은?

class Box<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class Exercise_12_1 {

    public static void main(String[] args) {




//        a. Box<Object> b = new Box<String>(); // V -> 에러 대입된 타입은 반드시 같아야 한다.
//        b. Box<Object> b = (Object)new Box<String>(); // V -> 에러. Object 타입을 Box<Object>
                                                        //      타입에 넣을수 없다.
//        c. new Box<String>().setItem(new Object());   // V -> 에러. 대입된 타입이 String이므로,
                                                        //      setItem(T item)의 매개변수 역시,
//        d. new Box<String>().setItem("ABC");          //      String 타입만 허용한다.


        Box<Object> obj = new Box<>();
        obj.setItem("abc");
        System.out.println("obj.getItem() = " + obj.getItem());
    }

}
