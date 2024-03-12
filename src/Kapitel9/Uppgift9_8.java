package Kapitel9;

import java.util.Scanner;

public class Uppgift9_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How much did it rain the first year? (0-3000 mm) ");
        int year1 = in.nextInt();

        if (year1 < 0 || year1 > 3000) { // Ends program if the input is over 3000
            System.out.println("Cant calculate");
            return;
        }
        String repeatYear1 = "*".repeat(year1 / 100); // Number of *'s


        System.out.println("How much did it rain the second year? (0-3000 mm)");
        int year2 = in.nextInt();

        if (year2 < 0 || year2 > 3000) { // Ends program if the input is over 3000
            System.out.println("Cant calculate");
            return;
        }
        String repeatYear2 = "*".repeat(year2 / 100);

        System.out.println("How much did it rain the third year? (0-3000 mm)");
        int year3 = in.nextInt();

        if (year3 < 0 || year3 > 3000) { // Ends program if the input is over 3000
            System.out.println("Cant calculate");
            return;
        }
        String repeatYear3 = "*".repeat(year3 / 100);

        System.out.println("Year   0        1        2        3    x1000 mm");
        System.out.println("   1   " + repeatYear1);
        System.out.println("   2   " + repeatYear2);
        System.out.println("   3   " + repeatYear3);
    }
}