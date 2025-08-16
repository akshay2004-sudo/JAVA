package JAVA;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input for the number of rows from the user
        System.out.print("Enter the number of rows from the user: ");
        int r=sc.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
