package Kapitel8;
import javax.swing.*;




public class Uppgift8_9 {
    public static void main(String[] args) {
        String ord = JOptionPane.showInputDialog("Särskrivet ord");
        String Sär = särSkriv(ord);
        System.out.println(Sär);

    }

    public static String särSkriv (String s) {
        s = s.replaceAll(" ", "");
        return s;
    }
}
