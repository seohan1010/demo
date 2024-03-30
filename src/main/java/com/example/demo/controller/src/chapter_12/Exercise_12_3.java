package com.example.demo.controller.src.chapter_12;



// [12-3] 다음중 올바르지 않은 문장을 모두 고르시오.

class Box2<T extends Fruit>{
    T item;
    void setItem(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
}

public class Exercise_12_3 {

    public static void main(String[] args) {


//        a. Box<?> b = new Box();
//        b. Box<?> b = new Box<>();
//        c. Box<?> b = new Box<Object>();   V
//        d. Box<Object> b = new Box<Fruit>();   V
//        e. Box b = new Box<Fruit>();
//        f. Box<? extends Fruit> b = new Box<Apple>();
//        g. Box<? extends Object> b = new Box<? extends Fruit>();    V



    }

}
