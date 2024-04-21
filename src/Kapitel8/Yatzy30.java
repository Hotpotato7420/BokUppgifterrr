package Kapitel8;

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
        String input;

        if (next + 1 > playerAmount) {
            next = -1;
        } else next++;

        System.out.println("Spelare " + playerList.get(next) + "'s tur");
        System.out.println();
        boolean ask = false;
        while (!ask) {
            System.out.println("Vill du spela? Y/N");
            input = in.next();
            if (input.equalsIgnoreCase("y")) {
                break;
            }
        }
        // -------------------------------------------------------------------------------------------------------------------\\
        int diceRolls = 6; // Number of dices left
        int totalNumber = 0; // Number of all the dices added together
        ArrayList<Integer> roll;
        roll = new ArrayList<>();

        boolean tst = false; // Only sends a message once per roll.
        boolean saving = false;

        ArrayList<Integer> numbers = new ArrayList<>();

        while (diceRolls > 0) {
            tst = false;


            for (int i = 0; i < diceRolls; i++) {
                for (int j = 0; j < diceRolls; j++) {
                    roll.add(diceRoll()); // Make the roll array which is the dices that we have rolled.
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
                if (diceRolls == 0){
                    break;
                }

                boolean saved = true;
                while (saved == true) {
                    if (diceRolls == 0){
                        break;
                    }
                    System.out.println("Vilken tärning vill du spara? ");
                    int save = in.nextInt(); // Tärningen som sparas

                    if (numbers.contains(save)) { // Kolla ifall tärningen finns i det som vi slagit
                        for (int j = 0; j < numbers.size(); j++) {
                            if (numbers.get(j) == save) {
                                numbers.remove(j); // Ta bort tärningen som du vill spara
                                savedDices.add(save); // Lägg till tärningen i savedDices listan
                                diceRolls--; // Ta bort en "tärnings slot" när man sparar en

                                System.out.print("Remaining dices: ");
                                System.out.println(numbers);
                                System.out.println("Saved: " + save);
                                break;
                            }
                        }
                    }


                    System.out.println("Vill du spara en till tärning? Y/N");
                    input = in.next();
                    if (input.equalsIgnoreCase("y")) {
                        System.out.println("Remaining dices: " + numbers);
                        saved = true; // Fortsätt att välja tärningar
                    } else if (diceRolls > 0) {
                        numbers.clear();
                        saved = false;
                    }
                }

                for (int j = 0; j < savedDices.size(); j++) { // Loop for adding the total amount of number from the dices.
                    totalNumber += savedDices.get(j);
                }
                System.out.println("Saved dices: " + savedDices + " = " + totalNumber);
            }


            if (diceRolls == 0) {
                totalNumber = 0;
                for (int j = 0; j < savedDices.size(); j++) { // Loop for adding the total amount of number from the dices.
                    totalNumber += savedDices.get(j);
                }
            }
        }
        if (totalNumber >= 30) {
            System.out.println("Lucky!");
        } else {
            int selfDamage = 30 - totalNumber;

            playerPoints.set(next, (playerPoints.get(next) - selfDamage));
        }
        System.out.println("Remaining HP: " + (playerPoints.get(next)));


        //----------------------------------------------------------------------------------------------------------------\\


          /*  boolean gameContinue = true;

            while (gameContinue) {
                if (next + 1 > playerAmount) {
                    next = 0;
                } else next++;
                System.out.println("Spelare " + playerList.get(next) + "'s tur");
                System.out.println();
                while (ask == false) {
                    System.out.println("Vill du spela? Y/N");
                    input = in.next();
                    if (input.equalsIgnoreCase("y")) {
                        break;
                    }
                }
                // ------------------------------------------------------------------------------------------------------------------\\


                diceRolls = 6; // Number of dices left
                totalNumber = 0; // Number of all the dices added together

                roll = new ArrayList<>();

                tst = false; // Only sends a message once per roll.
                saving = false;

                numbers = new ArrayList<>();

                while (diceRolls > 0) {
                    tst = false;

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
                            System.out.println("Vilken tärning vill du spara? ");
                            int save = in.nextInt(); // Tärningen som sparas

                            if (numbers.contains(save)) { // Kolla ifall tärningen finns i det som vi slagit
                                for (int j = 0; j < numbers.size(); j++) {
                                    if (numbers.get(j) == save) {
                                        numbers.remove(j); // Ta bort tärningen som du vill spara
                                        savedDices.add(save); // Lägg till tärningen i savedDices listan
                                        diceRolls--; // Ta bort en "tärnings slot" när man sparar en

                                        System.out.print("Remaining dices: ");
                                        System.out.println(numbers);
                                        System.out.println("Saved: " + save);
                                        break;
                                    }
                                }
                            }


                            System.out.println("Vill du spara en till tärning? Y/N");
                            input = in.next();
                            if (input.equalsIgnoreCase("y")) {
                                System.out.println("Remaining dices: " + numbers);
                                saved = true; // Fortsätt att välja tärningar
                            } else if (diceRolls == 0) {
                                numbers.clear();
                                saved = false;
                                saving = true;
                            }
                            if (diceRolls == 0){
                                saving = true;
                            }
                        }


                        for (int j = 0; j < savedDices.size(); j++) { // Loop for adding the total amount of number from the dices.
                            totalNumber += savedDices.get(j);
                        }
                        System.out.println("Saved dices: " + savedDices + " = " + totalNumber);
                    }


                    if (diceRolls == 0) {
                        totalNumber = 0;
                        for (int j = 0; j < savedDices.size(); j++) { // Loop for adding the total amount of number from the dices.
                            totalNumber += savedDices.get(j);
                        }
                    }
                }
                if (totalNumber >= 30) {

                } else {
                    int selfDamage = 30 - totalNumber;

                    playerPoints.set(next, (playerPoints.get(next) - selfDamage));
                }
                System.out.println("Remaining HP: " + (playerPoints.get(next)));
            }

           */
    }

    // Method for dice rolls, call when rolling a die
    public static int diceRoll(){


        int randomNum = (int)(Math.random() * 6) + 1; // Make a random-number that goes from 1-6
        // Below is the thing for calculating the die
        int dice;
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
        else if (randomNum == 6){
            dice = 6;
        }
        else dice = 6;
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
    public static ArrayList<Integer> startingPlayerPoints(int playerAmount, ArrayList<String> playerList){

        // Array for storing points
        ArrayList<Integer> playerPoints = new ArrayList<>();

        for (int i = 0; i < playerAmount; i++) { // Give every element 30 points
            playerPoints.add(30);
        }

        for (int i = 0; i < playerAmount; i++) {

            System.out.println("Spelare " + playerList.get(i) + " har "  + playerPoints.get(i) + " poäng.");
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