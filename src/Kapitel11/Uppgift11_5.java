package Kapitel11;

import java.util.Arrays;
import java.util.Scanner;

public class Uppgift11_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] myList = new double [10]; // Initialize an array with 10 numbers
        double[] otherList = new double [myList.length];

        System.out.println("Input numbers for the first array: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = in.nextDouble();
        }

        System.out.println("Input numbers for the second array: ");
        for (int i = 0; i < otherList.length; i++) {
            otherList[i] = in.nextDouble();
        }

        for (int i = 0; i < myList.length; i++) {
            if(myList[i] != otherList[i]){
                System.out.println("Not equal.");
                break;
            }
            if(i == myList.length-1){
                System.out.println("Equal arrays.");
            }
        }
        System.out.println("First  list: " + Arrays.toString(myList));
        System.out.println("Second list: " + Arrays.toString(otherList));
    }
}
