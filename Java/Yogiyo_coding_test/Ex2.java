package Yogiyo_coding_test;

/* 문제 :
 * N개의 문자로 구성된 문자열 S가 주어집니다.
 *  문자열이 단일 대시로 구분된 세 개의 숫자 세그먼트(각 3자리 길이)로 구성된 경우 유효한 전화 번호입니다.
 *  길이 N의 문자열 S가 주어질 때 문자열 S가 유효한 전화 번호를 나타내면 참을 반환하고 그렇지 않으면 거짓을 반환하는 함수 작성: 클래스 Solution { public boolean solution(String S); } 
 * 예제: 1. 문자열 S = "123-123-123"이 주어지면 이 함수는 참을 반환해야 합니다. 
 * 문자열 S = "123 123 123"이 주어지면 세그먼트가 대시 대신 공백으로 구분되어 있으므로 함수는 false를 반환해야 합니다.
 *  문자열 S = "123-123-1234"가 주어지면 마지막 세그먼트에 자릿수가 너무 많으므로 함수는 false를 반환해야 합니다.
 *  문자열 S = "001-501-511"이 주어지면 함수는 참을 반환해야 합니다. 
 * 문자열 S = "123-abc-123"이 주어지면, S에 문자가 포함되어 있으므로 함수는 거짓을 반환해야 합니다.
 *  문자열 S의 길이가 [0..30] 범위 내에 있고 소문자(a-z), 숫자(0-9), "_", "#", "-", " "(공백)으로만 구성되어 있다고 가정합니다.
 *  솔루션에서는 정확성에 중점을 두어야 합니다. 
 * 솔루션의 성능은 평가의 초점이 아닙니다.
 *  저작권 2009-2025 Codility Limited.
 *  모든 권리 보유. 무단 복사, 게시 또는 공개 금지.
 */
public class Ex2 {
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        String S = "123-123-123";
        boolean result = ex2.solution(S);
        System.out.println(result);
        
    }
    
    public boolean solution(String s){
        // 문자열을 -로 split
        String[] split = s.split("-");
        // split된 문자열의 길이가 3이 아니면 false
        if(split.length != 3){
            return false;
        }
        // split된 문자열의 길이가 3이면
        for(String str : split){
            // split된 문자열의 길이가 3이 아니면 false
            if(str.length() != 3){
                return false;
            }
            // split된 문자열이 숫자로만 이루어져 있지 않으면 false
            for(int i=0; i<str.length(); i++){
                if(!Character.isDigit(str.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

    
}
