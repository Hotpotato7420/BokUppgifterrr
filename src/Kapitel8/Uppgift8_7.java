package Kapitel8;
import java.util.Calendar;

public class Uppgift8_7 {
    public static void main(String[] args) {
        String s = klockan();
        System.out.println(s);
    }

    public static String klockan (){
        String s = Calendar.getInstance().getTime().toString();
        int i = s.indexOf(':');
        return (s.substring(i-2, i+6));
    }
}
