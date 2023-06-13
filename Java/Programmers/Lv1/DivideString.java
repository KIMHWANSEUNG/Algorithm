package Programmers.Lv1;

public class DivideString {
  //  s
//"banana"
    static String s = "banana";
    public static int solution(String s) {
        int firstCount = 1;
        int backCOunt = 0;
        int answer=0;

        char x = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(x == ' '){
                x=s.charAt(i);
                continue;
            }
            if(x==s.charAt(i)){
                firstCount++;
            }
            else{
                backCOunt++;
            }if(firstCount == backCOunt){
                answer++;
                x= ' ';
                firstCount = 1;
                backCOunt = 0;
            }

        }
        if(x!= ' '){
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(s));

    }
}
