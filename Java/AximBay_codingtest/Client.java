package codingtest;

import java.util.HashMap;

public class Client {

        //고객
        public String doClient(){
            //메뉴
            Menu menu = new Menu();
            //쉐프
            Shef shef = new Shef();


            //메뉴 리스트 크기
            int menu_size = menu.Menu_List().length;
    
            //메뉴 선택
            int menu_number=0;
    
            if(menu_number<menu_size){
                //요리사
                HashMap<String,String> order= menu.doMenu(menu_number);
                return "고객은 주문한 "+order.get("요리명")+"을 받았으며,"+order.get("먹는방식")+"으로 먹었습니다.";
            }else{
                return "메뉴번호가 없는 번호입니다. 다시 선택해 주세요.";
            }
            
        }
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.doClient());
    }

}
