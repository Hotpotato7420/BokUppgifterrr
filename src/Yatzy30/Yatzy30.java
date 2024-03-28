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
        System.out.println("Hur m�nga spelare �r det?");
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

            System.out.println("Spelare " + playerList.get(i) + " har "  + playerPoints[i] + " po�ng.");
        }
        return playerPoints;
    }





    // Skapa en Scanner som kan ta in input

    // Fr�ga anv�ndaren hur m�nga spelaren och dess namn.
    // Skapa en arrayList som sparar antal anv�ndare och dess namn.
    // Skapa en variabel f�r spelarens po�ng och ge 30 po�ng till alla spelare
    // Ankalla metoden Spel

    // Metod spel
    // Skapa variabel f�r talet som man sl�r
    // Skapa variabel f�r antalet t�rningar kvar.
    // Skapa t�rningar som spelaren ska sl�, typ anv�nda random funktionen och ta 1/6 = 1, 2/6 = 2, 3/6 = 3 osv.
    // Spelaren sl�r t�rningarna och v�ljer vilka den vill ha kvar, tvinga spelaren att v�lja en. Ta bort lika m�nga t�rningar som man v�ljer att ha kvar.
    // Spelaren g�r om det tills att den har inga t�rningar kvar.
    // Ifall spelaren f�r �ver 30, ankalla metoden battlePhase
    // Annars g� vidare till n�sta spelare och ta bort po�ng beroende p� hur mycket ifr�n 30 dem var.

    // Metod battlePhase
    // Fr�ga anv�ndaren vilken spelare den vill attackera.
    // Skapa variabel battleTal (talet - 30)
    // Sl� t�rningarna f�r talet du beh�ver (1 f�r 31, 2 f�r 32 etc.)
    // Ifall spelaren f�r det talet som den beh�ver s� spara den och sl� om resten av t�rningarna tills spelaren inte sl�r sitt tal.
    // Ifall du sl�r ett battleTal s� ta bort s� m�nga po�ng som antalet t�rningar * battleTal fr�n spelaren som du vill attackera. Annars g� till n�sta steg.
    // G� tillbaka till spel metoden och g� till n�sta spelare.

}