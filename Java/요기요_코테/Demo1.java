package 요기요_코테;

import java.util.Arrays;

/*
 * 이것은 데모 작업입니다.

함수를 작성하세요:

클래스 솔루션 { public int 솔루션(int[] A); }

N개의 정수로 구성된 배열 A가 주어지면 A에 없는 가장 작은 양의 정수(0보다 큰)를 반환합니다.

예를 들어 A = [1, 3, 6, 4, 1, 2]인 경우 함수는 5를 반환해야 합니다.

A = [1, 2, 3]인 경우 함수는 4를 반환해야 합니다.

A = [−1, −3]인 경우 함수는 1을 반환해야 합니다.

다음 가정에 대한 효율적인 알고리즘을 작성하십시오.

N은 [1..100,000] 범위 내의 정수입니다.
배열 A의 각 요소는 [−1,000,000..1,000,000] 범위 내의 정수입니다.
Codility Limited의 저작권 2009-2025. 모든 권리 보유. 무단복제, 출판, 공개를 금지합니다.
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 exam = new Demo1();
        int[] arr = {1, 3, 6, 4, 1, 2};
        System.out.println(exam.solution(arr));
    }



    public int solution(int[] arr) {
        int answer = 1;

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] <1 || arr[i]< answer) continue;
            if(arr[i] > answer){
                return answer;
            }else{
                answer++;

            } 
        }
    


        return answer;
    }
}



