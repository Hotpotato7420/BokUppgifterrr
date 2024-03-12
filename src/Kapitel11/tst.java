package Kapitel11;

import java.util.ArrayList;
import java.util.Scanner;

public class tst {
    public static int removeduplicates(int[] tal, int n) {
        int[] temp = new int[tal.length];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (tal[i] != tal[i + 1]) {
                temp[j++] = tal[i];
            }
        }
        temp[j++] = tal[n - 1];

        for (int i = 0; i < j; i++) {
            tal[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> talList = new ArrayList<>();

        System.out.println("Enter your numbers. Enter 0 to finish:");

        int num;
        while (true) {
            num = in.nextInt();
            if (num == 0)
                break;
            talList.add(num);
        }

        int[] tal = new int[talList.size()];
        for (int i = 0; i < talList.size(); i++) {
            tal[i] = talList.get(i);
        }

        int n = tal.length;
        n = removeduplicates(tal, n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            System.out.println(tal[i]);
        }
    }
}
