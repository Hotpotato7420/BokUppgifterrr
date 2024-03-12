package Kapitel9;

import java.util.Scanner;

public class Uppgift9_3Spinoff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hur mycket betalar du för?: ");

        // Alla variabler
        int amount  = in.nextInt();
        int amount1 = amount;
        int amount2 = amount;
        int amount3 = amount;
        int amount4 = amount;
        int amount5 = amount;

        int hundra = amount;
        for (hundra = 0; amount >= 100; hundra++) {
            int a = amount-100;
            amount = a;
        }

        int femtio = amount;
        for (femtio = 0; amount >= 50; femtio++) {
            int a = amount-50;
            amount = a;
        }
        int tjugo = amount;
        for (tjugo = 0; amount >= 20; tjugo++) {
            int a = amount-20;
            amount = a;
        }
        int tio = amount;
        for (tio = 0; amount >= 10; tio++) {
            int a = amount-1;
            amount = a;
        }
        int fem = amount;
        for (fem = 0; amount >= 5; fem++) {
            int a = amount-5;
            amount = a;
        }
        int ett = amount;
        for (ett = 0; amount >= 1; ett++) {
            amount = amount-1;
        }
        System.out.println(hundra + "st hundrakronorsedlar");
        System.out.println(femtio + "st femtiokronorssedlar");
        System.out.println(tjugo + "st tjugiokronorsedlar");
        System.out.println(tio + "st tiokronorsmynt");
        System.out.println(fem + "st femkronorsmynt");
        System.out.println(ett + "st enkronor");


        /* Sedlar/mynt
        100kr Sedel
        50kr Sedel
        20kr Sedel
        10kr Mynt
        5kr Mynt
        1kr Mynt
         */
    }
}
