package JAVA;

import java.util.Scanner;

public class printnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter a numbers from 0 to to n ");
        int n = sc.nextInt();
        // Using a for loop to print numbers from 1 to n
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
         System.out.println(); // Print a new line for better readability
        // Closing the scanner
        sc.close();
    }
    
}
