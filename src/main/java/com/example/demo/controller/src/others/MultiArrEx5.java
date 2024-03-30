package others;

public class MultiArrEx5 {


    public static void main(String[] args) {


        int[] numArr = new int[10];

        for(int i=0;i < numArr.length;i++){
            System.out.println(numArr[i] = (int)(Math.random()*10));
        }

        System.out.println();

        for (int i=0;i < numArr.length-1;i++){
            boolean changed =false; // 자리바꿈이 발생했는지를 체크
            // 매 반복문마다 초기화가 된다.

            for(int j=0;j < numArr.length-1-i;j++){
                if(numArr[j] > numArr[j+1]){ // 현재의 값이 다음 인덱스의 값보다 클때 자리바꿈
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            } // end for j

            if(!changed)break; // 자리바꿈이 없으면은 반복문을 벗어난다.

            for(int k=0;k<numArr.length;k++){
                System.out.println(numArr[k]);
                System.out.println();
            }


        } // end for i


    }


}
