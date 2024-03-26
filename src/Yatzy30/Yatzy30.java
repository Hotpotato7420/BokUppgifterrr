package Yatzy30;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Yatzy30 {


    public static void main(String[] args) {

        // Create a scanner that takes in input
        Scanner in = new Scanner(System.in);

        // Ask user for number of players
        System.out.println("Hur många spelare är det?");
        int playerAmount = in.nextInt();


        // Ask user for player names and put them into an ArrayList
        ArrayList<String> playerList = new ArrayList<>();
        int i = 0;
        String playerName;

        while (playerList.size() <= playerAmount) {
            playerName = in.nextLine();

            if (i > 0){ // Make the first character of their names uppercase
                playerName = playerName.substring(0, 1).toUpperCase() + playerName.substring(1);
            }

            playerList.add(playerName); // Add the playerName to the ArrayList

            if(i < playerAmount){ // The printout to ask for the names,
                System.out.println("Vad heter spelare " + (i + 1) + "?");
            }
            i++;
        }
        playerList.remove(0);

        System.out.println(playerList);

        int[] playerPoints = new int[playerAmount]; // Array for storing points
            for (i = 0; i < playerAmount; i++) {
                playerPoints[i] = 30;
            }
        for (i = 0; i < playerAmount; i++) {
            System.out.println("Spelare " + playerList.get(i) + " har "  + playerPoints[i] + " poäng.");
            }

        System.out.println(Arrays.toString(playerPoints));





        diceRoll();
        System.out.println("You rolled a " + diceRoll());
    }

    // Method for dice rolls, call when rolling a die
    public static int diceRoll(){

    int dice;
    int randomNum = (int)(Math.random() * 6); // Make a random-number that goes from 1-6
    // Below is the thing for calculating the die
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
