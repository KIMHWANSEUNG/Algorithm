package Programmers.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Honorboard {
    //[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]
    static int [] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
    static int k =4;
    public static int[] solution(int k, int[] score) {

        int[] scoreArr = new int[score.length];
        int index = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int scoreNumber: score){
            arrayList.add(scoreNumber);
            Collections.sort(arrayList,Collections.reverseOrder());

            if(arrayList.size()<k){
               scoreArr[index]=arrayList.get(arrayList.size()-1);
            }else {
                scoreArr[index]=arrayList.get(k-1);
            }
            index++;
        }

        return scoreArr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(k,score)));

    }
}
