package codingtest;

import java.util.HashMap;

public class Menu {
        //메뉴판
        public String[][] Menu_List(){
            String[][] menu_list = {{"갈비찜","한식","젓가락","한식요리사"},{"파스타","양식","포크","양식요리사"},{"마파두부","중식","숟가락","중식요리사"}};
    
            return menu_list;
        }

            //메뉴
    public HashMap<String,String> doMenu(int menu_number){
        Shef shef = new Shef();

        String[][] menu = Menu_List();
        
        HashMap<String,String> order = new HashMap<String,String>(); 

        order.put("요리명", menu[menu_number][0]);
        order.put("음식분류", menu[menu_number][1]);
        order.put("먹는방식", menu[menu_number][2]);
        order.put("요리사", menu[menu_number][3]);
        
        System.out.println("고객은 "+order.get("요리명")+"을 주문하였습니다.");
        return shef.doShef(order);
    }
}
