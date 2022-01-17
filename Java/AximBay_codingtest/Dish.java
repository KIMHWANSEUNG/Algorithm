package codingtest;

import java.util.HashMap;

public class Dish {
        //요리
        public void doDish(HashMap<String,String> order){
            System.out.println(order.get("요리사")+"는 "+order.get("요리명")+"을 만들었습니다.");
            
        }
}
