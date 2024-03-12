package Kapitel9;

public class Uppgift9_5 {
    public static void main(String[] args) {
        for (int i=1; i<13; i++){

            String slump; //Stringen som kommer skrivas ut som svaret
            double random = Math.random(); // variabel för randomness
            if (random<=0.33){ // 1/3 chans att bli X
                slump = String.valueOf(1);

            } else if (random>0.33 && random <= 0.66) { // 1/3 chans att bli X
                slump = "X";
            }
            else
                slump = String.valueOf(2); // 1/3 chans att bli 2

            System.out.println(i + ": " + slump); // Skriver ut radnummer (i) + svaret (1/X/2)
        }
    }
}