package Kapitel8;
import java.util.Calendar;

public class Uppgift8_8 {
    public static void main(String[] args) {
        String s = datum();
        System.out.println(s);
    }

    public static String datum(){
        String datumNu = Calendar.getInstance().getTime().toString(); // Fa in data
        String ar = datumNu.substring(24, 28); // Ta ut aret
        String manad = datumNu.substring(4, 7); // Ta ut manaden
        String dag = datumNu.substring(8,11); // Ta ut datumet

        manad = manaderCheck(manad);

        datumNu = ar + "-" + manad + "-" + dag;
        return datumNu;
    }

    public static String manaderCheck (String manad){ // Metod for manad namn -> siffror

        if (manad.contains("Jan")){
            manad = "01";}

        if (manad.contains("Feb")) {
            manad = "02";}

        if (manad.contains("Mar")){
            manad = "03";}

        if (manad.contains("Apr")){
            manad = "04";}

        if (manad.contains("May")){
            manad = "05";}

        if (manad.contains("Jun")) {
            manad = "06";}

        if (manad.contains("Jul")){
            manad = "07";}

        if (manad.contains("Aug")){
            manad = "08";}

        if (manad.contains("Sep")){
            manad = "09";}

        if (manad.contains("Oct")) {
            manad = "10";}

        if (manad.contains("Nov")){
            manad = "11";}

        if (manad.contains("Dec")){
            manad = "12";}

        return manad;
    }
}
