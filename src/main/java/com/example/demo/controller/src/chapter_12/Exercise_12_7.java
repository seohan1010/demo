package com.example.demo.controller.src.chapter_12;


// [12-7] 메타 애너테이션 TestInfo가 다음과 같이 정의되어 있을때,
//        이 애너테이션이 올바르게 적용되지 않은 것은?

// a. @TestInfo class Exercise12_7{}
// b. @TestInfo(1) class Exercise12_7{} V
// c. @TestInfo("bbb") class Exercise12_7{}
// d. @TestInfo("bbb","ccc") class Exercise12_7{} V




//b. @TestInfo(1) class Exercise12_7 {}
//요소의 이름이 value가 아닌 경우에는 요소의 이름을 생략할 수 없다
//@TestInfo(count=1) 이라고 써야 맞음.


//d. @TestInfo("bbb","ccc") class Exercise12_7 {}
//요소의 타입이 배열이고 지정하려는 값이 여러 개인 경우 괄호 {}가 필요함.
//@TestInfo({"bbb", "ccc"}) @TestInfo(value={"bbb","ccc"}) 또는 와 같이 써야함

public class Exercise_12_7 {

    public static void main(String[] args) {



    }

}
