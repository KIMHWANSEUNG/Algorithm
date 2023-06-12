package Programmers.Lv2;

import java.util.*;

// 프로그래머스 lv2 요격시스템 문제
public class MisileSystem {
    //[[4,5],[4,8],[10,14],[11,13],[5,12],[3,7],[1,4]]
    static int[][] d = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
    //solution
    public static int solution(int[][] targets){

        int answer = 0;
        Arrays.sort(targets,(o1,o2) -> {
            if(o1[1] == o2[1]){
                System.out.println("o1"+o1[0]+"o2"+o2[0]);
                return o1[0] - o2[0];
            } else{
                System.out.println(o1[1]+"-"+o2[1]);

                return o1[1] - o2[1];
            }
        });

        int endPoint = targets[0][1];
        answer++;

        for(int i=0;i<targets.length;i++){
            if(endPoint<=targets[i][0]){
                endPoint = targets[i][1];
                answer++;
            }
        }




        System.out.println(Arrays.deepToString(targets));
        System.out.println("answer : "+answer);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(d));
    }
}
