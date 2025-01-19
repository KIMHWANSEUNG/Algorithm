package Programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;

//다시 풀어보기
public class KnightWeapon {

    /*
     * Lv0. 기사단원의 무기 
     */

    public static void main(String[] args) {
        KnightWeapon knightWeapon = new KnightWeapon();
        System.out.println(knightWeapon.solution(10, 3, 2));
        
    }

    public int solution(int number, int limit, int power) {

        // 약수구하기
        int answer = 0;
 
        for(int i=1;i<=number;i++){
            int cnt = 0;

            for(int j=1;j<=i;j++){
                if(i%j==0) cnt++;
            }
            
            if(cnt>limit){
                cnt = power;
            } 

            answer += cnt;
        }




        return answer;


    }
 
    
}
