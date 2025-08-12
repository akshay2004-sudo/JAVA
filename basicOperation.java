package JAVA;

import java.util.*;

public class basicOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from the user   
        int a, b;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        
        sc.nextLine(); // consume the leftover newline
        
        String name = sc.nextLine();
        System.out.println(name);
        
        // Performing 4 basic operations
        // Addition
        int sum = a + b;
        // Subtraction
        int difference = a - b;
        // Multiplication 
        int product = a * b;
        // Division
        double q = (double) a / b;
        double w = (double) a * b / a - b;
        double s = (double) (a * b) / (a - b); // Cast to double for accurate division

        // Printing the results 
        // Printing the name..
        System.out.println("the entered name is: " + name);
        //displaying the value of a and b
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + q);
        System.out.println("w: " + w);
        System.out.println("s: " + s);
        
        // Closing the scanner
        sc.close();
    }
}
