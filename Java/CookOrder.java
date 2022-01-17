
import java.util.HashMap;


public class CookOrder {

    //메뉴판(추가클래스)
    public String[][] Menu_List(){
        String[][] menu_list = {{"갈비찜","한식","젓가락","한식요리사"},{"파스타","양식","포크","양식요리사"},{"마파두부","중식","숟가락","중식요리사"}};

        return menu_list;
    }

    //고객
    public String Client(){
        //메뉴 리스트 크기
        int menu_size = Menu_List().length;

        //메뉴 선택
        int menu_number=0;

        if(menu_number<menu_size){
            //요리사
            HashMap<String,String> order= Shef(Menu(menu_number));
            return "고객은 주문한 "+order.get("요리명")+"을 받았으며,"+order.get("먹는방식")+"으로 먹었습니다.";
        }else{
            return "메뉴번호가 없는 번호입니다. 다시 선택해 주세요.";
        }
        
    }
    //메뉴
    public HashMap<String,String> Menu(int menu_number){
        String[][] menu = Menu_List();
        
        HashMap<String,String> order = new HashMap<String,String>(); 

        order.put("요리명", menu[menu_number][0]);
        order.put("음식분류", menu[menu_number][1]);
        order.put("먹는방식", menu[menu_number][2]);
        order.put("요리사", menu[menu_number][3]);

        System.out.println("고객은 "+order.get("요리명")+"을 주문하였습니다.");
        return order;
    }
    //요리사
    public HashMap<String,String> Shef(HashMap<String,String> order){

        System.out.println(order.get("요리사")+"는 "+order.get("요리명")+" 주문을 받았습니다.");
        Dish(order);
        return order;

    }
    //요리
    public void Dish(HashMap<String,String> order){
        System.out.println(order.get("요리사")+"는 "+order.get("요리명")+"을 만들었습니다.");
        
    }
    public static void main(String[] args) {
        CookOrder cookOrder = new CookOrder();
        System.out.println(cookOrder.Client());
    }

    
}