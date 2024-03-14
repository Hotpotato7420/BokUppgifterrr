package Kapitel11;

import java.util.Scanner;

public class Uppgift11_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] myList = new double[5]; // Initialize new array

        System.out.println("Enter numbers: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = in.nextDouble();
        }
        System.out.println(sum(myList));


    }

    public static double sum(double[] array){
        double sum = 0;
        double addedSum;
        for (int i = 0; i < array.length; i++) {

            addedSum = sum + array[i];
            sum = addedSum;
        }
        return sum;
    }
}
