package Kapitel11;

import java.util.Arrays;
import java.util.Scanner;

public class Uppgift11_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] myList = new double [10]; // Initialize an array with 10 numbers
        double[] copyList = new double[myList.length];

        System.out.println("Input your numbers: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = in.nextDouble();
        }
        System.out.println(Arrays.toString(myList));

        System.out.println("Where do you want to start copying from?: ");
        int startingNumber = in.nextInt();


        System.out.println("Where do you want to stop copying from?: ");
        int endingNumber = in.nextInt();



        for (int i = 0; startingNumber <= endingNumber; i++) { // The copy function loop
            copyList[startingNumber-1] = myList[startingNumber-1];
            startingNumber++;

        }
        System.out.println("Original list: " + Arrays.toString(copyList));
        System.out.println("  Copied list: " + Arrays.toString(copyList));



    }
}
