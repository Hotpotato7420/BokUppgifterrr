package Kapitel11;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift11_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> talList = new ArrayList<>();

        System.out.println("Enter your numbers: 0 to exit.");
        int num;
        while (true) { // Dynamic array that grows as long as you dont exit it
            num = in.nextInt();
            if (num == 0) // Exit if you enter a 0
                break;
            talList.add(num); // Add the number to the list
        }
        int[] tal = new int[talList.size()]; // Make an array out of the ArrayList
        for (int i = 0; i < talList.size(); i++) {
            tal[i] = talList.get(i); // Transfer over the arrayList to the array
        }


        boolean[] isDuplicate = new boolean[tal.length]; // Make a boolean array to check for duplicates

        for (int i = 0; i < tal.length; i++) {
            if (!isDuplicate[i]) { // Checks for duplicates
                for (int b = i + 1; b < tal.length; b++) {
                    if (tal[i] == tal[b]) {
                        isDuplicate[b] = true; // Puts isDuplicate = true to duplicates
                    }
                }
                System.out.println(tal[i]); // Prints non dupes
            }
        }
    }
}


