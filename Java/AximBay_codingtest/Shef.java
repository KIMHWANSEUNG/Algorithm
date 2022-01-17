package codingtest;

import java.util.HashMap;

public class Shef {

        //요리사
        public HashMap<String,String> doShef(HashMap<String,String> order){

            Dish dish = new Dish();
            System.out.println(order.get("요리사")+"는 "+order.get("요리명")+" 주문을 받았습니다.");
            dish.doDish(order);
            return order;
    
        }
    
}
