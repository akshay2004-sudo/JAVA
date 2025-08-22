package JAVA;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int o=sc.nextInt();
        for(int i=1;i<=o;i++){
            for(int j=1;j<=o-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=o;i>=1;i--){
            for(int j=1;j<=o-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
    }
    sc.close();
}
}