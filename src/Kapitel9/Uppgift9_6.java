package Kapitel9;
import java.util.Scanner;
import java.util.stream.Stream;

public class Uppgift9_6 {
    static final int OUT = 0;
    static final int IN = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Skriv: ");
        String text = in.nextLine();

        int tecken = text.length(); // Tar ut längden på stringen
        System.out.print("tecken: " + tecken + "    ");

        Stream<String> rader = text.lines(); // Räknar ut antalet rader
        System.out.print("rader: " + rader.count() + "    ");


        antalOrd(new Scanner(text));

    }


    public static void antalOrd(Scanner in) { //Metod för att räkna antalet ord
        int antalOrd = 0;
        while (in.hasNext()) {
            antalOrd++;
            in.next();
        }
        System.out.println("ord: " + antalOrd);
    }
}



        /*int ord = antalOrd(text);
        System.out.println("ord: " + ord);


      static int antalOrd(String s) {
     int state = OUT;
     int ord = 0;
     int i = 0;

     while (i < s.length()){
         if (s.charAt(i) == ' ' || s.charAt(i) == '\n' || s.charAt(i) == '\t'){
            state = OUT;
         }
         else if (state == OUT){
             state = IN;
             ++ord;
         }
         i++;
     }
     return ord;
    }

 */