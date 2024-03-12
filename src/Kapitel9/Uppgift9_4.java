package Kapitel9;


import java.util.Scanner;


public class Uppgift9_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hur mycket vill du ta ut varje ar?(kr) ");
        String s = input.next();
        double ut = Double.parseDouble(s);

        System.out.print("Hur mycket ar rantan?(%) ");
        String rentS = input.next(); // Skapar en String
        rentS = rentS.replace("%", ""); //Tar bort % ifran stringen ifall man svarat med det
        int rent = Integer.parseInt(rentS); // Gor om stringen till en int


        System.out.print("Hur mycket har du pa kontot?(kr) ");
        double belopp = input.nextDouble();

        if (ut > belopp*0.01*rent){ // Stanger programmet tidigt ifall uttaget ar mer an rantan.
            System.out.println("For stort uttag.");
            System.exit(0);
        }

        System.out.print("Hur manga ar vill du se? ");
        int years = input.nextInt();



        beloppVidUttag(belopp, rent, years, ut);
    }




    public static void beloppVidUttag(double b, double r, int n, double ut){

        for (int i=1; i <= n; i++){//Ett varv per ar
            b = b +b*(0.01*r)-ut;

            System.out.println("ar: " + i + " | " + b + "kr");
        }
    }
}

