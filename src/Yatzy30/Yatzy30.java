package Yatzy30;

import java.util.ArrayList;
import java.util.Scanner;




public class Yatzy30 {

    // Create scanner that can be used in any method
    private static final Scanner in = new Scanner (System.in);

    private static int next = -1;

    private static ArrayList<Integer> playerPoints = null;


    public static void main(String[] args) {

        int playerAmount = getPlayerAmount();
        ArrayList<String> playerList = getPlayerList(playerAmount);
        playerPoints = startingPlayerPoints(playerAmount, playerList);

        mainGame(playerAmount, playerList, playerPoints);
    }

    public static void mainGame(int playerAmount, ArrayList<String> playerList, ArrayList<Integer> playerPoints) {

        if (next+1 > playerAmount){
            next = -1;
        }
        else next++;

        System.out.println("Spelare " + playerList.get(next) + "'s tur");
        System.out.println();
        boolean ask = false;
        while (!ask) {
            System.out.println("Vill du spela? Y/N");
            if ((in.next().equals("y")) || (in.next().equals("Y"))) {
                break;
            }
        }
// -------------------------------------------------------------------------------------------------------------------\\
        int diceRolls = 6; // Number of dices left
        ArrayList<Integer> roll;
        roll = new ArrayList<>();
        boolean tst = false; // Only sends a message once per roll.
        boolean saving = false;

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < diceRolls; i++) {
            for (int j = 0; j < diceRolls; j++) {
                // Make the roll array which is the dices that we have rolled.
                roll.add(diceRoll());
            }
            for (int j = 0; j < roll.size(); i++) {
                numbers.add(roll.get(j));
                roll.remove(j);
            }

            if (i > 0) {
                if (tst == false) {
                    System.out.print("You rolled: ");
                    tst = true;
                }
                String msg = numbers.toString();
                System.out.println(msg);
            }
        }
        ArrayList<Integer> savedDices = new ArrayList<>();
        if (saving == false) {


            boolean saved = true;
            while (saved == true) {
                System.out.println("Vilken t�rning vill du spara? ");
                int save = in.nextInt(); // T�rningen som sparas

                if (numbers.contains(save)) { // Kolla ifall t�rningen finns i det som vi slagit
                    for (int j = 0; j < numbers.size(); j++) {
                        if (numbers.get(j) == save) {
                            numbers.remove(j); // Ta bort t�rningen som du vill spara
                            savedDices.add(save); // L�gg till t�rningen i savedDices listan

                            System.out.print("Remaining dices: ");
                            System.out.println(numbers);
                            System.out.println("Saved: " + save);
                            break;
                        }
                    }
                }
                System.out.println("Vill du spara en till t�rning? Y/N");
                if ((in.next().equals("y")) || (in.next().equals("Y"))) {
                    System.out.println("Remaining dices: " + numbers);
                    saved = true;
                } else {
                    saved = false;
                }
            }
            System.out.print("Saved dices: " + savedDices);
        }


        int totalNumber = 0;
        for (int j = 0; j < savedDices.size(); j++) { // Loop for adding the total amount of number from the dices.
            totalNumber += savedDices.get(j);
        }
        if (totalNumber >= 30) {

        }
        else {
            int selfDamage = 30-totalNumber;

            playerPoints.set(next, (playerPoints.get(next) - selfDamage));
        }
        System.out.println("Remaining HP: " + (playerPoints.get(next)));


    //----------------------------------------------------------------------------------------------------------------\\
        boolean gameContinue = true;

        while(gameContinue){
            if (next+1 > playerAmount){
                next = 0;
            }
            else next++;
            System.out.println("Spelare " + playerList.get(next) + "'s tur");
            System.out.println();
            while (ask == false) {
                System.out.println("Vill du spela? Y/N");
                if ((in.next().equals("y")) || (in.next().equals("Y"))) {
                    break;
                }
            }
// -------------------------------------------------------------------------------------------------------------------\\
            diceRolls = 6; // Number of dices left

            roll = new ArrayList<>();
            tst = false; // Only sends a message once per roll.
            saving = false;

            numbers = new ArrayList<>();

            for (int i = 0; i < diceRolls; i++) {
                for (int j = 0; j < diceRolls; j++) {
                    // Make the roll array which is the dices that we have rolled.
                    roll.add(diceRoll());
                }
                for (int j = 0; j < roll.size(); i++) {
                    numbers.add(roll.get(j));
                    roll.remove(j);
                }

                if (i > 0) {
                    if (tst == false) {
                        System.out.print("You rolled: ");
                        tst = true;
                    }
                    String msg = numbers.toString();
                    System.out.println(msg);
                }
            }
            savedDices = new ArrayList<>();
            if (saving == false) {

                boolean saved = true;
                while (saved == true) {
                    System.out.println("Vilken t�rning vill du spara? ");
                    int save = in.nextInt(); // T�rningen som sparas

                    if (numbers.contains(save)) { // Kolla ifall t�rningen finns i det som vi slagit
                        for (int j = 0; j < numbers.size(); j++) {
                            if (numbers.get(j) == save) {
                                numbers.remove(j); // Ta bort t�rningen som du vill spara
                                savedDices.add(save); // L�gg till t�rningen i savedDices listan

                                System.out.print("Remaining dices: ");
                                System.out.println(numbers);
                                System.out.println("Saved: " + save);
                                break;
                            }
                        }
                    }
                    System.out.println("Vill du spara en till t�rning? Y/N");
                    if ((in.next().equals("y")) || (in.next().equals("Y"))) {
                        System.out.println("Remaining dices: " + numbers);
                        saved = true;
                    } else {
                        saved = false;
                    }
                }
                System.out.print("Saved dices: " + savedDices);
            }


            totalNumber = 0;
            for (int j = 0; j < savedDices.size(); j++) { // Loop for adding the total amount of number from the dices.
                totalNumber += savedDices.get(j);
            }
            if (totalNumber >= 30) {

            }
            else {
                int selfDamage = 30-totalNumber;

                playerPoints.set(next, (playerPoints.get(next) - selfDamage));
            }
            System.out.println("Remaining HP: " + (playerPoints.get(next)));


        }
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
    public static ArrayList<Integer> startingPlayerPoints(int playerAmount, ArrayList<String> playerList){

        // Array for storing points
        ArrayList<Integer> playerPoints = new ArrayList<>();

        for (int i = 0; i < playerAmount; i++) { // Give every element 30 points
            playerPoints.add(30);
        }

        for (int i = 0; i < playerAmount; i++) {

            System.out.println("Spelare " + playerList.get(i) + " har "  + playerPoints.get(i) + " po�ng.");
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