package JAVA;

import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter a number n to print natural numbers from 1 to n: ");
        int n = sc.nextInt();

        // Using a for loop to print natural numbers from 1 to n
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum=sum+i;
        }
        // Using a while loop to print natural numbers from 1 to n
        System.out.println(sum);
        
        System.out.println();
        // Print a new line for better readability
        // Closing the scanner
        sc.close();
    }

    
}
