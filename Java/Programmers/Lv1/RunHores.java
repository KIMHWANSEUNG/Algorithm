package Programmers.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;

public class RunHores {

//    public static String[] swapElements(String[] array, int index1, int index2) {
//        String temp = array[index1];
//        array[index1]=array[index2];
//        array[index2]=temp;
//        return array;
//    }
//    public static void main(String[] args) {
//        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
//        String[] callings = {"kai", "kai", "mine", "mine"};
//        String[] result = new String[0];
//
//        for(String call : callings){
//            int callIndex = Arrays.asList(players).indexOf(call);
//            result = swapElements(players, callIndex-1, callIndex);
//        }
//        System.out.println(Arrays.toString(result));
//        //String[] result ={"mumu", "kai", "mine", "soe", "poe"};
//    }

    public static String[] main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result = new String[0];

        HashMap<String,Integer> playerMap = new HashMap<>();
        HashMap<Integer,String> rankedMap = new HashMap<>();

        for(int i=0; i<players.length; i++){
            playerMap.put(players[i],i);
            rankedMap.put(i,players[i]);
        }

        for(String call : callings){
            int callIndex = playerMap.get(call);
            int temp = callIndex-1;
            playerMap.put(call, temp);
            playerMap.put(rankedMap.get(temp),callIndex);
            rankedMap.put(callIndex,rankedMap.get(temp));
            rankedMap.put(temp,call);
        }


        //String[] result ={"mumu", "kai", "mine", "soe", "poe"};
        return rankedMap.values().toArray(new String[rankedMap.size()]);
    }
}


