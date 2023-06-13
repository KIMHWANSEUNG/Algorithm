package Programmers.Lv1;

//프로그래머스 카드뭉치
public class CardDump {

//card1 ["i", "drink", "water"]
    static String[] card1 = {"i", "drink", "water"};
// card2 ["want", "to"]
    static String[] card2 = {"want", "to"};
// goal ["i", "want", "to", "drink", "water"]
// "Yes"
    static String[] goal = {"i", "want", "to", "drink", "water"};
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        int cardIndex1 = 0;
        int cardIndex2 = 0;

        for(String strGoal: goal){
            if(cardIndex1<cards1.length && strGoal.equals(cards1[cardIndex1])){
                cardIndex1++;
            } else if(cardIndex2<cards2.length && strGoal.equals(cards2[cardIndex2])){
                cardIndex2++;
            } else{
                answer = "No";
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(card1,card2,goal));

    }
}
