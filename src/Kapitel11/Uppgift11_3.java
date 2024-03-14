package Kapitel11;

import java.util.Arrays;
import java.util.Scanner;

public class Uppgift11_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] myList = new double[5]; // Initialize array


        System.out.println("Input your numbers: ");
        for (int i = 0; i < myList.length; i++) { // Get input for the array
            myList[i] = in.nextDouble();
        }




        if (isSorted(myList)){ // If the array is sorted print out "true"
            System.out.println("true");
        }
        else{ // If the array isnt sorted print out "false"
            System.out.println("false");
        }
        System.out.println(Arrays.toString(myList)); // Print out the Array
    }


    public static boolean isSorted(double[] array){
        for (int i = 0; i < array.length; i++) {
            if (i > 0){ // Make it not check the first number
                if (array[i] > array[i-1]){ // If current number is bigger than previous one, return false.
                    return false;
                }
            }
        }
        return true; // Else return true
    }
}
