import java.util.ArrayList;
import java.util.Scanner;

public class Yatzy30 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hur m�nga spelare �r det?");
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
