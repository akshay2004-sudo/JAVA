package JAVA;

import java.util.Scanner;

public class pattren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input for the number of rows from the user
        System.out.println("enter the number of row from the user: ");
        int n=sc.nextInt();
        // Taking input for the number of columns from the user
        System.out.println("enter the number of column from the user: ");
        int m=sc.nextInt();
        // Printing the pattern
        // Outer loop for rows
        for(int i=1;i<=n;i++){
            // inner loop for the coloumn
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        // End of the program
    }
    
}
