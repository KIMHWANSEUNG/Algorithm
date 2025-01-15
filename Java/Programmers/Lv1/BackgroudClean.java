

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BackgroudClean {
//["..........", ".....#....", "......##..", "...##.....", "....#....."]
    static String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};

    public static int[] solution(String[] wallpaper){


        ArrayList<Integer> xArr = new ArrayList<>();
        ArrayList<Integer> yArr = new ArrayList<>();

        int yIndex = 0;
        for(String wall : wallpaper){
            //제일 최소 x축과 y축 구하기
            //제일 최대 x축 y축 구하기
            int xIndex = 0;
            char[] wallArr = wall.toCharArray();
            for(char wallChar : wallArr){
                if(wallChar == '#'){
                    xArr.add(xIndex);
                    yArr.add(yIndex);
                    System.out.println(yIndex+"------"+xIndex);
                }
                xIndex++;
            }
            yIndex++;
        }

        int xMin = Collections.min(xArr);
        int xMax = Collections.max(xArr)+1;
        int yMin = Collections.min(yArr);
        int yMax = Collections.max(yArr)+1;

        int []result = {yMin,xMin,yMax,xMax};
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(wallpaper));


    }
}
