package JAVA;
import java.util.Scanner;   
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();   
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        // Checking which number is greater or lesser
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is lesser than " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
        // Closing the scanner
        sc.close(); // Closing the scanner
    }
}