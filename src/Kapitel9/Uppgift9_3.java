package Kapitel9;

import java.util.Scanner;

public class Uppgift9_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hur mycket betalar du for? ");
        int amount = in.nextInt();

        System.out.print("Hur mycket betalar du med? ");
        int betalar = in.nextInt();

        int payment = betalar-amount;
        if (payment < 1){
            System.out.println("Du betalade mindre an vad du ska");
        }
        else {
            int hundra = payment;
            for (hundra = 0; payment >= 100; hundra++) {
                int a = payment-100;
                payment = a;
            }

            int femtio = payment;
            for (femtio = 0; payment >= 50; femtio++) {
                int a = payment-50;
                payment = a;
            }
            int tjugo = payment;
            for (tjugo = 0; payment >= 20; tjugo++) {
                int a = payment-20;
                payment = a;
            }
            int tio = payment;
            for (tio = 0; payment >= 10; tio++) {
                int a = payment-1;
                payment = a;
            }
            int fem = payment;
            for (fem = 0; payment >= 5; fem++) {
                int a = payment-5;
                payment = a;
            }
            int ett = payment;
            for (ett = 0; payment >= 1; ett++) {
                payment = payment-1;
            }
            if (hundra > 0){
                System.out.println(hundra + "st hundrakronorsedlar");
            }
            if (femtio > 0){
                System.out.println(femtio + "st femtiokronorssedlar");
            }
            if (tjugo > 0){
                System.out.println(tjugo + "st tjugiokronorsedlar");
            }
            if (tio > 0){
                System.out.println(tio + "st tiokronorsmynt");
            }
            if (fem > 0){
                System.out.println(fem + "st femkronorsmynt");
            }
            if (ett > 0){
                System.out.println(ett + "st enkronor");
            }

        }

    }
}
