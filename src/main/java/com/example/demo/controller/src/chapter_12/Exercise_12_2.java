package com.example.demo.controller.src.chapter_12;


//[12-2] 지네릭 메서드 makeJuice()가 아래와 같이 정의되어 있을 때, 이 메서드를 올바르게 호출한
//       문장을 고르시오. (Apple과 Grape는 Fruit의 자손이라고 가정하다.)


import java.util.ArrayList;
import java.util.List;

class FruitBox<T> {
    List<Fruit> list = new ArrayList<>();

    public void setList(Fruit f) {
        list.add(f);
    }

    List<Fruit> getList() {
        return list;
    }
}

class Fruit {
}

class Apple extends Fruit {
}

class Grape extends Fruit {
}

class Juicer {

    static <T extends Fruit> String makeJuice(FruitBox<T> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return tmp;
    }

}

public class Exercise_12_2 {


    public static void main(String[] args) {

//    a.Juicer.<Apple> makeJuice(new FruitBox<Fruit>()); // 제너릭 메서드와 매개변수의 타입이 다르다
//    b.Juicer.<Fruit> makeJuice(new FruitBox<Grape>()); // Grape가 Fruit의 자손이라고 해도 타입이 다르기 때문에 에러
//    c.Juicer.<Fruit> makeJuice(new FruitBox<Fruit>()); V
//    d.Juicer.makeJuice(new FruitBox<Apple>());   V
//    e.Juicer.makeJuice(new FruitBox<Object>()); //Object는 Fruit의 자손이 아니므로 에러

    }


}


