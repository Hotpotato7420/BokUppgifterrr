package Kapitel8;
import javax.swing.*;

public class Uppgift8_2 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Hur mycket kostar varan?");
        double pris = Double.parseDouble(s);
        double tot = (momsberakning.moms(pris));
        System.out.println("Totala kostnaden ar: " + tot + "kr");
        System.out.println("Kostnaden utan moms ar: " + pris + "kr");
        System.out.println("Momsen ar: " + momsberakning.MOMS_PROCENT + "%");
    }
    public class momsberakning{
        public static final double MOMS_PROCENT = 1.250;

        public static double moms (double a){
            return a * (momsberakning.MOMS_PROCENT);

        }
    }
}
