package Kapitel8;
import javax.swing.*;

public class Uppgift8_5 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Tal");
        int a = Integer.parseInt(s);
        multiplikationsTabell(a);

    }
    public static void multiplikationsTabell (int a) {

        System.out.println( "1   |   " + a * 1 +
                "\n2   |   " + a * 2 +
                "\n3   |   "+ a * 3 +
                "\n4   |   " + a * 4 +
                "\n5   |   " + a * 5 +
                "\n6   |   " + a * 6 +
                "\n7   |   " + a * 7 +
                "\n8   |   " + a * 8 +
                "\n9   |   " + a * 9 +
                "\n10  |   " + a * 10);
        JOptionPane.showMessageDialog(null, "1   |   " + a * 1 +
                "\n2   |   " + a * 2 +
                "\n3   |   "+ a * 3 +
                "\n4   |   " + a * 4 +
                "\n5   |   " + a * 5 +
                "\n6   |   " + a * 6 +
                "\n7   |   " + a * 7 +
                "\n8   |   " + a * 8 +
                "\n9   |   " + a * 9 +
                "\n10  |   " + a * 10);
    }





}
