package Kapitel8;
import javax.swing.*;

public class Uppgift8_3 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Satt in ett tal");
        int t = Integer.parseInt(s);

        boolean prim;
        prim = arEttPrimtal(t);
        System.out.println(prim);
    }
    public static boolean arEttPrimtal (int a) {
        boolean arPrimtal = true;

        for (int k = 2; k < a; k++) if (a % k == 0)
            arPrimtal = false;
        if (arPrimtal == true) {
            return true;
        }
        return false;
    }
}

