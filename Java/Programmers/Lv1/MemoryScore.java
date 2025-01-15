
import java.util.Arrays;
import java.util.HashMap;

public class MemoryScore
{
    static String[] name = {"may", "kein", "kain", "radi"};
    static int[] yearning = {5, 10, 1, 3};
    static String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
    //int[] result = {19, 15, 6};
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        HashMap<String,Integer> nameValueMap = new HashMap<>();
        int nameIndex = 0;
        for(int value : yearning){
            nameValueMap.put(name[nameIndex],value);
            nameIndex++;
        }
        int[] result = new int[photo.length];
        int resultIndex = 0;

        for(String[] photoArr : photo){
            int resultValue = 0;
            for(String nameKey: photoArr){
                if(nameValueMap.containsKey(nameKey)){
                    resultValue += nameValueMap.get(nameKey);
                }
            }
            result[resultIndex] = resultValue;
            resultIndex++;
        }

        return result;

    }
    public static void main(String[] args) {
        int[] result = solution(name, yearning, photo);
        System.out.println(Arrays.toString(result));
    }
}
