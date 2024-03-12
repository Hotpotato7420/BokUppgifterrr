package Kapitel9;

import java.util.Scanner;

public class Uppgift9_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("When does the program start? (hh.mm): ");
        String startTime = in.nextLine(); // Input data for startTime

        int startHour, startMinute, endHour, endMinute; // Initialize variables

        if (startTime.length() == 5){ // End operation if not in hh.mm format
             startHour = Integer.parseInt(startTime.substring(0, 2));
             startMinute = Integer.parseInt(startTime.substring(3, 5));
        }
        else { // breaks the operation
            System.out.println("Wrong format, may have forgotten a '.' or not written out the 0 in single digit hours.");
            return;
        }

        System.out.print("When does the program end? (hh.mm): "); // Input data for endTime
        String endTime = in.nextLine();

        if (endTime.length() == 5){ // End operation if not in hh.mm format
            endHour = Integer.parseInt(endTime.substring(0, 2));
            endMinute = Integer.parseInt(endTime.substring(3, 5));
        }
        else { // Ends operation
            System.out.println("Wrong format, may have forgotten a '.' or not written out the 0 in single digit hours.");
            return;
        }






        // Create two new variables
        int hours = startHour - endHour;
        int minutes = startMinute - endMinute;

        // Turn minutes positive if its negative, no negative numbers in hours
        if (minutes < 0)
            (minutes) = (-minutes);

        if (endMinute < startMinute) { // ifall slutminut < startminut
            if (hours < 0){ // if the program is under 1 hour
                if (endHour - startHour == 1 || endHour - startHour == 0 ){ // Programmer < 1 timme
                    System.out.println("The program takes " + (0) + " hours and " +
                            (60-minutes) + " minutes. n.1" );
                }
            }
        }
            else if (startHour < endHour){ // if the program is
                System.out.println("The program takes " + (-hours ) + " hours and " +
                        (minutes) + " minutes. n.2");
            }


       if (startHour > endHour) { //if the program is over a day long
           if (endMinute < startMinute){ //When the program is over a day and the minutes need a special operations
               System.out.println("The program takes " + ((24-startHour) + endHour) + " hours and " +
                       (60-minutes) + " minutes.");
           }
           else { // When program is over a day long and the minutes can do normal operation
               System.out.println("The program takes " + ((24-startHour) + endHour) + " hours and " +
                       (minutes) + " minutes.");
            }

        }

    }
}