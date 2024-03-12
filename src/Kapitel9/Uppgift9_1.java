
package Kapitel9;

import java.util.Scanner;

public class Uppgift9_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Dagens matarstallning?: ");
        int matarStallning = in.nextInt(); // Laser in dagens matarstallning

        System.out.print("Matarstallning ett ar sedan?: ");
        int meterOneYear = in.nextInt(); // Laser in matarstallningen ett ar sen

        System.out.print("Antal liter forbrukad bensin?: ");
        int forbrukadBensin = in.nextInt(); // Laser in antalet forbrukad bensin

        double kordaMil = matarStallning - meterOneYear;
        System.out.println("Antal korda mil?: " + (kordaMil)); // Beraknar antalet korda mil

        System.out.println("Antal liter bensin: " + forbrukadBensin);

        System.out.println("Forbrukning per mil: " + (forbrukadBensin/kordaMil));

    }
}