package Codility;

import java.util.HashMap;

/*
 * N개의 정수로 구성된 비어 있지 않은 배열 A가 주어졌습니다. 배열에는 홀수의 요소가 포함되어 있으며, 배열의 각 요소는 같은 값을 가진 다른 요소와 쌍을 이룰 수 있지만, 한 요소는 쌍을 이루지 않습니다.

예를 들어, 다음과 같은 배열 A에서:

A[0] = 9 A[1] = 3 A[2] = 9
A[3] = 3 A[4] = 9 A[5] = 7
A[6] = 9
인덱스 0과 2의 요소는 값 9를 가지고,
인덱스 1과 3의 요소는 값 3을 가지고,
인덱스 4와 6의 요소는 값 9를 가지고,
인덱스 5의 요소는 값 7을 가지고 쌍을 이루지 않습니다.
함수를 작성하세요:

class Solution { public int solution(int[] A); }

위의 조건을 충족하는 N개의 정수로 구성된 배열 A가 주어지면, 쌍을 이루지 않은 요소의 값을 반환합니다.

예를 들어, 다음과 같은 배열 A가 주어졌습니다.

A[0] = 9 A[1] = 3 A[2] = 9
A[3] = 3 A[4] = 9 A[5] = 7
A[6] = 9
위의 예에서 설명한 대로 함수는 7을 반환해야 합니다.

다음 가정에 대한 효율적인 알고리즘을 작성하세요.

N은 [1..1,000,000] 범위 내의 홀수 정수입니다.
배열 A의 각 요소는 [1..1,000,000,000] 범위 내의 정수입니다.
A의 값 중 하나를 제외한 모든 값이 짝수 번 발생합니다.
Copyright 2009–2025 by Codility Limited. All Rights Reserved. 무단 복사, 게시 또는 공개 금지.
 */
public class Lesson2ArrayEx2 {

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // 배열을 순회하며 숫자의 등장 횟수 저장
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 홀수 번 등장하는 숫자 찾기
        for (int key : countMap.keySet()) {
            if (countMap.get(key) % 2 != 0) {
                return key;
            }
        }

        return -1; // 기본적으로 모든 숫자가 짝수 번 등장한다면 -1 반환
    }

    
}
