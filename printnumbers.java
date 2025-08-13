package JAVA;

import java.util.*;



public class printnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter a numbers from 0 to to n ");
        int n = sc.nextInt();
        // Using a for loop to print numbers from 1 to n
        //where n is the number entered by the user and the last number is n
        /*for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }*/
        int i = 0; // Initialize i to 0
        /*  while (i<= n) {
            System.out.print(i + " ");
            i++; // Increment n to eventually exit the loop
        }*/
        do{
            System.out.print(i + " ");
            i++; // Increment i to eventually exit the loop
        }while (i <= n); // Continue until i exceeds n

         System.out.println(); // Print a new line for better readability
        // Closing the scanner
        sc.close();
    }
    
}
