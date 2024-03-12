package Kapitel8;

import javax.swing.*;
public class Uppgift8_1 {
    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog("Skriv in din siffra");
        int tal = Integer.parseInt(s);

        int tecken = heltal(tal);

        if(tecken > 0) {
            System.out.println("1");
        }
        if (tecken < 0) {
            System.out.println("-1");
        }
        if (tecken == 0) {
            System.out.println("0");
        }
    }

    public static int heltal (int a){
        return a;
    }
}
