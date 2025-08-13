package JAVA;

import java.util.Scanner;

public class tworandomnumber {
    public static void main(String[] args) {
        // Program to multiply two random numbers
        // Importing Scanner class for user input 
        Scanner sc = new Scanner(System.in);
        // Taking first input
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        // Taking second input
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        // Multiplication
        double result = num1 * num2;
        // Output
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);
        // Closing the scanner
        sc.close();
    }
    
}
