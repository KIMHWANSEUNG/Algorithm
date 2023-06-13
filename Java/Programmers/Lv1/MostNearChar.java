package Programmers.Lv1;

import java.util.Arrays;

//가장가까운글자
//프로그래머스 lv1
public class MostNearChar {

    //s
  //"banana"
    public static String s = "banana";
    public static int[] solution(String s) {
        String[]  sArr = s.split("");
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for(int i=1;i<sArr.length;i++){
            answer[i] = -1;
            for(int j=i-1;j>=0;j--){
                answer[i]=i-j;
            }
            }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(s)));

    }
}

