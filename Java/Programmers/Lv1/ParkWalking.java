package Programmers.Lv1;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkWalking {

    static String[] park ={ "SOO",
            "OOO",
            "OOO"};
    static String[] routes = {"E 2","S 2","W 1"};
       //result = [2,1]
      public static int[] solution(String[] park, String[] routes) {

          Map<String,Integer> parkMap = new HashMap<>();
          Map<String,Integer> routesMap = new HashMap<>();

          //find 'S' index
          int xIndex = 0;
          int yIndex = 0;
          for(String parkString : park){
            List<String> parkArr = Arrays.asList(parkString.split(""));
            if(parkArr.contains("S")){
                xIndex = parkArr.indexOf("S");
                yIndex = parkMap.size();
            }
          }
          int[] result = {xIndex,yIndex};


          for(String route : routes){
            String[] routeArr = route.split(" ");
            if(routeArr[0].equals("S") || routeArr[0].equals("W")){
                routesMap.put(routeArr[0],-(Integer.parseInt(routeArr[1])));
            }else {
                routesMap.put(routeArr[0],Integer.parseInt(routeArr[1]));
            }
          }

          routesMap.forEach((key,value) -> {
              if(key.equals("W") || key.equals("E")){
                  result[1] += value;
              }else {
                  result[0] += value;
              }
          });

          for(int i=0; i<result.length; i++){
              result[i]= Math.abs(result[i]);

          }
          System.out.println(Arrays.toString(result));

          return result;
      }
    public static void main(String[] args) {
        solution(park, routes);

    }
}
