package Kapitel9;

import java.util.Locale;
import java.util.Scanner;

public class Uppgift9_2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("SE"));

        Scanner in = new Scanner(System.in);

        System.out.print("Dagens matarstallning?: ");
        int matarStallning = in.nextInt(); // Laser in dagens matarstallning

        System.out.print("Matarstallning ett ar sedan?: ");
        int matarEttar = in.nextInt(); // Laser in matarstallningen ett ar sen

        System.out.print("Antal liter forbrukad bensin?: ");
        double forbrukadBensin = in.nextDouble(); // Laser in antalet forbrukad bensin

        double kordaMil = matarStallning - matarEttar;
        System.out.format(new Locale("sv", "SE"),"Antal korda mil: %.2f \n",  (kordaMil)); // Beraknar antalet korda mil

        System.out.format(new Locale("sv", "SE"),
                "Antal liter bensin: %.2f \n", forbrukadBensin);

        // Gor forbukningen till en variabel och sedan anvander den
        double forbrukning = forbrukadBensin/kordaMil;
        System.out.format(new Locale("sv", "SE"),
                "Forbrukning per mil: %.2f \n",forbrukning);

    }
}