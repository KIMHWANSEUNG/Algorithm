package Programmers.Lv1;

import org.jcp.xml.dsig.internal.dom.DOMTransform;
import sun.misc.InnocuousThread;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkWalking {

    static String[] park = {"SOO",
        "OOO",
        "OOO"};
    static String[] routes = {"E 2", "S 2", "W 1"};

    //result = [2,1]
    public static int[] solution(String[] park, String[] routes) {

        char[][] arr = new char[park.length][park[0].length()];
        //find 'S' index
        int xIndex = 0;
        int yIndex = 0;
        for(int i =0;i< park.length;i++){
            for(int j=0;j<park[0].length();j++){
                arr[i][j] = park[i].charAt(j);
                if(arr[i][j]=='S'){
                    xIndex = j;
                    yIndex = i;
                }
            }
        }


        for (String route : routes) {
            String way = route.split(" ")[0];
            int len = Integer.parseInt(route.split(" ")[1]);

            int nx = xIndex;
            int ny = yIndex;

            for (int i = 0; i < len; i++) {
                if (way.equals("E")) {
                    nx++;
                }
                if (way.equals("W")) {
                    nx--;
                }
                if (way.equals("S")) {
                    ny++;
                }
                if (way.equals("N")) {
                    ny--;
                }
                if (nx >= 0 && ny >= 0 && nx < arr[0].length && ny < arr.length) {
                    if (arr[ny][nx] == 'X') {
                        break;
                    }
                    //장애물 x일 경우
                    if (i == len - 1) {
                        xIndex = nx;
                        yIndex = ny;
                    }
                }
            }
        }



        int[] result = {yIndex, xIndex};
        return result;
    }

    public static void main(String[] args) {
        solution(park, routes);

    }
}
