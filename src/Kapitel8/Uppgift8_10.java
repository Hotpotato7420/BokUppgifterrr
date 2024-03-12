package Kapitel8;
import javax.swing.*;

public class Uppgift8_10 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Skriv in ett ord");
        String b = JOptionPane.showInputDialog("Skriv in ett tal");
        int n = Integer.parseInt(b);
        String lika = metod(s, n);
        System.out.println(lika);
    }
    public static String metod (String s, int n) {
        int length = s.length();
        String v = s;
        if (length < n) {

            int blank = n-length;
            String blankn = " ";
            String repeated = blankn.repeat(blank);
            v = repeated + s;
        }
        else if (length == n) {
            return v;
        }
        else {
            return v.substring(0, n);
        }
        return v;
    }
}
