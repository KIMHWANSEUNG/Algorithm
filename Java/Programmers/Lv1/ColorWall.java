

//프로그머스 덧칠하기 LV1

import java.util.Arrays;

public class ColorWall
{
    static int n = 8;
    static int m = 4;

    static int[] section = {2,3,6};

    public static int solution(int n, int m , int[] section){
        int startPoint = section[0];
        int endPoint = section[0] + (m-1);
        int result=1;

        for(int i :section){
            if(startPoint<=i && i<=endPoint)
                continue;
            else{
                startPoint = i;
                endPoint = i + (m-1);
                result++;
            }
        }
        return result;

    }
    public static void main(String[] args) {

        System.out.println(solution(n, m, section));


    }
}
