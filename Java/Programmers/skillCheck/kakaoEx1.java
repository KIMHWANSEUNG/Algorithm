package Programmers.skillCheck;

import java.util.ArrayList;
import java.util.Arrays;

//카카오 신입 공채 순위검색 문제
//풀이 진행중
public class kakaoEx1 {

    static String[] info = {"java backend junior pizza 150",
                            "python frontend senior chicken 210",
                            "python frontend senior chicken 150",
                            "cpp backend senior pizza 260",
                            "java backend junior chicken 80",
                            "python backend senior chicken 50"};

    //["java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"]
    static String[] query = {"java and backend and junior and pizza 100",
                            "python and frontend and senior and chicken 200",
                            "cpp and - and senior and pizza 250",
                            "- and backend and senior and - 150",
                            "- and - and - and chicken 100",
                            "- and - and - and - 150"};
    public static void main(String[] args) {

        System.out.println(solution(info,query));

    }
        public static int[] solution(String[] info, String[] query) {
            int[] answer = new int[query.length];

            for(int i=0;i<query.length;i++){
                int matchCount =0;

                String[] queryStrArr = query[i].split(" and | ");
                System.out.println(Arrays.toString(queryStrArr));
                for(int j=0;j<info.length;j++){
                    String[] infoStrArr =  info[j].split(" ");
                    System.out.println(Arrays.toString(infoStrArr));

                    //마지막 숫자 비교
                    if(j==info.length-1){
                        int queryScore = Integer.parseInt(queryStrArr[i]);
                        int infoScore = Integer.parseInt(infoStrArr[i]);
                        if(queryScore <= infoScore){
                            matchCount+=1;
                        }
                    }
                    //숫자비교가 아닐시
                    else {
                        if(queryStrArr[i] == infoStrArr[j]){
                            matchCount+=1;
                        }else {
                            break;
                        }
                    }
                }
                answer[i]=matchCount;
            }










            return answer;
        }

}
