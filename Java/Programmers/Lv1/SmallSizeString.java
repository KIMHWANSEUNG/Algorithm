
//크기가 작은 부분 문자열
//프로그래머스 lv1
//t	p	result
    //"3141592"	"271"	2


public class SmallSizeString {
    public static String t = "3141592";
    public static String p = "271";


     static int solution(String t, String p) {
        int answer = 0;
        int lenP = p.length();
        int intP = Integer.parseInt(p);

         for(int i=0;i<t.length()-lenP+1;i++){
             int intT =Integer.parseInt(t.substring(i,i+lenP));
             if(intT<=intP)
                 answer++;
         }


            return answer;

    }
    public static void main(String[] args) {
        System.out.println(solution(t,p));


    }
}
