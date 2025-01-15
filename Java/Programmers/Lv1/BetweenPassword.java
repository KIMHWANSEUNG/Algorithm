

import java.util.Arrays;

//둘만의암호 프로그래머스 lv 1
public class BetweenPassword {
    //s	         skip	index	result
  //  "aukks"	"wbqd"	5	"happy"
    static String s = "aukks";
    static String skip = "wbqd";
    static int index = 5;


    public static String solution(String s, String skip, int index) {
        String answer = "";
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            for(int j = 0;j<index;j++){
                c+=1;
                if(c>'z'){
                    c -=26;
                }
                if( skip.contains(String.valueOf(c))){
                    j--;
                }
            }
            answer += c;

        }



        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(s, skip, index));

    }
}
