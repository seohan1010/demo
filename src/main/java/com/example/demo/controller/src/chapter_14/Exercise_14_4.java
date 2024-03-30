package com.example.demo.controller.src.chapter_14;


//[14-4] 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
//       [Hint] 배열을 사용하시오.


import java.lang.reflect.Array;
import java.util.*;

@FunctionalInterface
interface Together {

   List added();


}

public class Exercise_14_4 {

    public static void main(String[] args) {


        Together th = () -> {
//            Set<int[]> set = new HashSet<>(50);
            List list = new ArrayList();
            int[] arr = new int[2];
//            for (int i = 0; i < 100; i++) {
//
//                int num1 = (int) (Math.random() * 6);
//                int num2 = (int) (Math.random() * 6);
//                System.out.println(num1 +", "+num2);
//                if (num1 + num2 == 6) {
//                    arr[0] = num1;
//                    arr[1] = num2;
//                    list.add(arr);
//                    System.out.println("arr = " + Arrays.toString(arr));
//
//                }
            list.add(new int[]{1,2});
            list.add(new int[]{1,3});
            list.add(new int[]{1,4});
            list.add(new int[]{1,5});
            list.add(new int[]{1,6});
            list.add(new int[]{1,7});

//            } // end of for

//            System.out.println("set.size() = " + list.size());
//
            return list;
        }; // end of lamda


        List list = th.added();
        Iterator iter = list.iterator();


        while (iter.hasNext()) {

            System.out.println("iter.hasNext() = " + Arrays.toString((int[]) iter.next()));
        }
    }


}
