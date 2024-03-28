package Yatzy30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




public class Yatzy30 {

    // Create scanner that can be used in any method
    private static final Scanner in = new Scanner (System.in);



    public static void main(String[] args) {
        // Ask user for number of players
        int playerAmount = getPlayerAmount();

        // Ask user for the names of the players and put them into an ArrayList
        ArrayList<java.lang.String> playerList = getPlayerList(playerAmount);

        // Give players 30 points from the start in an array
        int[] playerPoints = startingPlayerPoints(playerAmount, playerList);


        mainGame();
    }

    public static void mainGame() {
        int diceRolls = 6; // Number of dices left
        int[] roll = new int[diceRolls];

        ArrayList<Integer> numbers = null;
        for (int i = 0; i < diceRolls; i++) {
            int dice1, dice2, dice3, dice4, dice5, dice6;
            for (int j = 0; j < diceRolls; j++){
                // Make the roll array which is the dices that we have rolled.
                // roll[i] = rollDice();
            }
            if (i == 0) {
                System.out.print("You rolled: ");
            }

            numbers = new ArrayList<>();
            int roll = diceRoll();
            numbers.add(roll);
        }
        ArrayList<Integer> chosenNumbers = new ArrayList<>();



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


    // Method for getting the player amount
    public static int getPlayerAmount(){
        System.out.println("Hur många spelare är det?");
        return in.nextInt();
    }

    // Method for getting the player names
    public static ArrayList<String> getPlayerList(int playerAmount) {

        // Ask user for player names and put them into an ArrayList
        ArrayList<String> playerList = new ArrayList<>();
        int i = 0;
        String playerName;

        while (playerList.size() <= playerAmount) { // Use < instead of <= here
            playerName = in.nextLine();

            if (i > 0) { // Make the first character of their names uppercase
                playerName = playerName.substring(0, 1).toUpperCase() + playerName.substring(1);
            }

            playerList.add(playerName); // Add the playerName to the ArrayList

            if (i <= playerAmount - 1) { // Adjust condition here to avoid extra iteration
                System.out.println("Vad heter spelare " + (i + 1) + "?");
            }
            i++;
        }
        playerList.remove(0); // Remove the first index, which is empty.
        System.out.println(playerList);
        return playerList;
    }


    // Method for setting the players starting points
    public static int[] startingPlayerPoints(int playerAmount, ArrayList<String> playerList){

        int[] playerPoints = new int[playerAmount]; // Array for storing points
        Arrays.fill(playerPoints, 30); // Give every element 30 points
        for (int i = 0; i < playerAmount; i++) {

            System.out.println("Spelare " + playerList.get(i) + " har "  + playerPoints[i] + " poäng.");
        }
        return playerPoints;
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