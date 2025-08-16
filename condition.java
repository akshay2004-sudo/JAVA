package JAVA;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt();
        // Checking the age condition
        if (age < 10) {
            System.out.println("that is a child.");
        } else if (age <= 18 ) {
            System.out.println("The person is a minor.");
        } else if (age <= 60) {
            System.out.println("The person is a adult.");
        }
        else {
            System.out.println("The person is a senior citizen.");
        }
        sc.close();

    }
    
}
