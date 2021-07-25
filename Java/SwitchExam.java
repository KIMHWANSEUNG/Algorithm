import java.util.Calendar;
public class SwitchExam {
    public static void main(String[] args) {
        // month에는 오늘이 몇 월인지 들어 있습니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";

        switch (month){
            case  12:
            case  1:
            case  2:
            season="겨울";
            System.out.println("지금은 " + month + "월이고, " + season+"입니다.");
                   break;    
            case  3:
            case  4:
            case  5:
            season="봄";
            System.out.println("지금은 " + month + "월이고, " + season+"입니다.");
            break;    
            case  6:
            case  7:
            case  8:
            season="여름";
            System.out.println("지금은 " + month + "월이고, " + season+"입니다.");
            break;   
            case  9:
            case  10:
            case  11:
            season="가을";
                System.out.println("지금은 " + month + "월이고, " + season+"입니다.");
                   break;
                  }
        
       
    }
}