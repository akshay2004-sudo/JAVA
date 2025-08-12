package JAVA;

import java.util.Scanner;

public class switchbreak {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        // Taking input from the user   
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = sc.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
        // Closing the scanner
        sc.close();
    }
}
