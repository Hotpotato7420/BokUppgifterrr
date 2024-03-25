import java.util.ArrayList;
import java.util.Scanner;

public class Yatzy30 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hur många spelare är det?");
        int players = in.nextInt();

        
        for (int i = 1; i <= players; i++){
            System.out.println("Vad heter spelare " + i + "?");

        }
        //String[] playerList

        diceRoll();
        System.out.println("You rolled a " + diceRoll());
    }


    public static int diceRoll(){

    int dice;
    int randomNum = (int)(Math.random() * 6);
    if (randomNum <= 1){
        dice = 1;
    }
    else if (randomNum == 2){
        dice = 2;
    }
    else if (randomNum == 3){
        dice = 3;
    }
    else if (randomNum == 4){
        dice = 4;
    }
    else if (randomNum == 5){
        dice = 5;
    }
    else {
        dice = 6;
    }


        return dice;
    }






        // Skapa en Scanner som kan ta in input

        // Fråga användaren hur många spelaren och dess namn.
        // Skapa en arrayList som sparar antal användare och dess namn.
        // Skapa en variabel för spelarens poäng och ge 30 poäng till alla spelare
        // Ankalla metoden Spel

        // Metod spel
        // Skapa variabel för talet som man slår
        // Skapa variabel för antalet tärningar kvar.
        // Skapa tärningar som spelaren ska slå, typ använda random funktionen och ta 1/6 = 1, 2/6 = 2, 3/6 = 3 osv.
        // Spelaren slår tärningarna och väljer vilka den vill ha kvar, tvinga spelaren att välja en. Ta bort lika många tärningar som man väljer att ha kvar.
        // Spelaren gör om det tills att den har inga tärningar kvar.
        // Ifall spelaren får över 30, ankalla metoden battlePhase
        // Annars gå vidare till nästa spelare och ta bort poäng beroende på hur mycket ifrån 30 dem var.

        // Metod battlePhase
        // Fråga användaren vilken spelare den vill attackera.
        // Skapa variabel battleTal (talet - 30)
        // Slå tärningarna för talet du behöver (1 för 31, 2 för 32 etc.)
        // Ifall spelaren får det talet som den behöver så spara den och slå om resten av tärningarna tills spelaren inte slår sitt tal.
        // Ifall du slår ett battleTal så ta bort så många poäng som antalet tärningar * battleTal från spelaren som du vill attackera. Annars gå till nästa steg.
        // Gå tillbaka till spel metoden och gå till nästa spelare.

}
