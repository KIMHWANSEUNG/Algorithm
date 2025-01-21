package Codility;

/*
 * 양의 정수 N 내의 이진 간격은 N의 이진 표현에서 양쪽 끝이 1로 둘러싸인 연속 0의 최대 시퀀스입니다.

예를 들어, 숫자 9는 이진 표현 1001을 가지며 길이 2의 이진 간격을 포함합니다. 숫자 529는 이진 표현 1000010001을 가지며 두 개의 이진 간격(길이 4와 길이 3 중 하나)을 포함합니다. 숫자 20은 이진 표현 10100을 가지며 다음을 포함합니다. 길이가 1인 하나의 이진 갭. 숫자 15는 이진 표현 1111을 가지며 이진 갭이 없습니다. 숫자 32는 이진 표현 100000을 가지며 이진 간격이 없습니다.

함수를 작성하세요:

클래스 솔루션 { public int 솔루션(int N); }

이는 양의 정수 N이 주어지면 가장 긴 이진 간격의 길이를 반환합니다. N에 이진 간격이 포함되어 있지 않으면 함수는 0을 반환해야 합니다.

예를 들어, N = 1041인 경우 N에는 이진 표현 10000010001이 있고 가장 긴 이진 간격의 길이는 5이기 때문에 함수는 5를 반환해야 합니다. N = 32인 경우 N에는 이진 표현 '100000'이 있으므로 함수는 0을 반환해야 합니다. 바이너리 갭이 없습니다.

다음 가정에 대한 효율적인 알고리즘을 작성하십시오.

N은 [1..2,147,483,647] 범위 내의 정수입니다.
 */

 /*
  *  체점결과 : 100점
  */
public class Lesson1 {

    public static void main(String[] args) {
        Lesson1 lesson1 = new Lesson1();
        System.out.println(lesson1.solution(1041));
    }

    public int solution(int N) {

        int answer = 0;

        String binary = Integer.toBinaryString(N);

        // 1. 1의 위치를 찾는다.
        int start = binary.indexOf("1");
        System.out.println("start: "+start);
        // 2. 1의 위치 다음부터 1의 위치를 찾는다.
        int end = binary.indexOf("1", start+1);
        System.out.println("end: "+end);

        // 3. 1의 위치가 없으면 0을 반환한다.
        if(end == -1) return 0;

        // 4. 1의 위치가 있으면 1의 위치와 1의 위치 사이의 길이를 구한다.
        while(end != -1){
            int length = end - start - 1;
            answer = Math.max(answer, length);
            start = end;
            end = binary.indexOf("1", start+1);
        }

        return answer;

    }
    
}
