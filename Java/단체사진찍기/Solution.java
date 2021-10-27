package 단체사진찍기;

class Solution {
    static String[] arr = {"A","C","F","J","M","N","R","T"};
    static String[] result = new String[8];
    static boolean[] used = new boolean[8];
    static int answer;

    public int solution(int n, String[] data) {
        int answer = 0;
        perm(0,data);
        return answer;
    }

    static void perm(int cnt,String [] data){
        if(cnt==8){
            String s = "";
            for(int i=0; i<arr.length; i++){
                s+=result[i];
            }
            
        }
    }


}