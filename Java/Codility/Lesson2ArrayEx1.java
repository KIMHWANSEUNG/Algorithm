package Codility;

import java.util.Deque;
import java.util.LinkedList;

/*
 * N개의 정수로 구성된 배열 A가 제공됩니다. 배열의 회전은 각 요소가 하나의 인덱스만큼 오른쪽으로 이동하고 배열의 마지막 요소가 첫 번째 위치로 이동함을 의미합니다. 예를 들어 배열 A = [3, 8, 9, 7, 6]의 회전은 [6, 3, 8, 9, 7]입니다(요소는 한 인덱스만큼 오른쪽으로 이동하고 6은 첫 번째 위치로 이동됩니다).

목표는 배열 A를 K번 회전시키는 것입니다. 즉, A의 각 요소가 오른쪽으로 K번 이동됩니다.

함수를 작성하세요:

클래스 솔루션 { public int[] 솔루션(int[] A, int K); }

N개의 정수와 정수 K로 구성된 배열 A가 주어지면 K번 회전된 배열 A를 반환합니다.

예를 들어, 주어진

    A = [3, 8, 9, 7, 6]
    케이 = 3
함수는 [9, 7, 6, 3, 8]을 반환해야 합니다. 3번의 회전이 이루어졌습니다:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
또 다른 예를 들면,

    A = [0, 0, 0]
    K = 1
함수는 [0, 0, 0]을 반환해야 합니다.

주어진

    A = [1, 2, 3, 4]
    케이 = 4
함수는 [1, 2, 3, 4]를 반환해야 합니다.

다음과 같이 가정합니다.

N과 K는 [0..100] 범위 내의 정수입니다.
배열 A의 각 요소는 [−1,000..1,000] 범위 내의 정수입니다.
솔루션에서는 정확성에 집중하세요. 솔루션의 성능은 평가의 초점이 되지 않습니다.
 */
public class Lesson2ArrayEx1 {

    public static void main(String[] args) {
        Lesson2ArrayEx1 lesson2ArrayEx1 = new Lesson2ArrayEx1();
        int[] A = {1, 2, 3, 4};
        int[] B = {3, 8, 9, 7,6};
        // 배열 print
        int[] result = lesson2ArrayEx1.solution(B, 3);
    
    }

    public int[] solution(int[] A, int K) {
        
        // A배열을 deque 로 전환
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0; i<A.length; i++){
            deque.add(A[i]);
        }


        for(int i=0; i<K; i++){
            // deque 마지막 요소를 꺼내서 Queue의 맨 앞에 넣는다.
            int last = deque.pollLast();
            deque.addFirst(last);
        }


        // Queue를 배열로 전환
        int[] answer = new int[A.length];
        for(int i=0; i<A.length; i++){
            answer[i] = deque.poll();
        }

        return answer;
    }


    
}
