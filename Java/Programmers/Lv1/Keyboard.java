package Programmers.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Keyboard {

    public static int[] solution(String[] keymap, String[] targets) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int[] ret = new int[targets.length];

        for(String key : keymap) {
            for(int i=0 ; i<key.length() ; i++) {
                char c = key.charAt(i);
                if(!hm.containsKey(c) || i<hm.get(c)) {
                    hm.put(c, i+1);
                }
            }
        }

        for(int i=0 ; i<targets.length ; i++) {
            int cnt = 0;
            for(int j=0 ; j<targets[i].length() ; j++) {
                char c = targets[i].charAt(j);
                if(!hm.containsKey(c)) {
                    cnt = 0;
                    break;
                } else {
                    cnt += hm.get(c);
                }
            }
            ret[i] = cnt==0?-1:cnt;
        }
        return ret;

    }
    public static void main(String[] args) {

        //["ABACD", "BCEFD"]
        String[] keymap = {"AGZ", "BSSS"};
        //["ABCD","AABB"]
        String [] targets = {"ASA","BGZ"};



        System.out.println(Arrays.toString(solution(keymap,targets)));

    }
}
