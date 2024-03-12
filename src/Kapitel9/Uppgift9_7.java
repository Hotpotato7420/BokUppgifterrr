package Kapitel9;

import java.util.Scanner;

public class Uppgift9_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("write in p-language");

        String text = in.nextLine();
        text = text.toLowerCase();

        if (text.contains("apa")) {
            text = text.replace("apa", "a");
        }
        if (text.contains("opo")) {
            text = text.replace("opo", "o");
        }
        if (text.contains("upu")) {
            text = text.replace("upu", "u");
        }
        if (text.contains("epe")) {
            text = text.replace("epe", "e");
        }
        if (text.contains("ipi")) {
            text = text.replace("ipi", "i");
        }
        if (text.contains("ypy")) {
            text = text.replace("ypy", "y");
        }
        if (text.contains("äpä")) {
            text = text.replace("äpä", "ä");
        }
        if (text.contains("åpå")) {
            text = text.replace("åpå", "å");
        }
        if (text.contains("öpö")) {
            text = text.replace("öpö", "ö");
        }
        System.out.println(text);
    }
}