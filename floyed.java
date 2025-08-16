package JAVA;

import java.util.Scanner;

public class floyed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input for the number of rows from the user
        System.out.print("Enter the number of rows from the user: ");
        int y=sc.nextInt();
        int n =1;
        for(int i=1;i<=y;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
