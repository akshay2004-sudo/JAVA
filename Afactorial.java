package JAVA;

import java.util.*;

public class Afactorial {
    public static void printfactorial(int n){
        if(n<0){
            System.out.println("factorial is not possible");
            return ;
        }
        int r=1;
        for(int i=n;i>=1;i--){
            r=r*i;
        }
        System.out.println(r);
        return ;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        printfactorial(n);
        sc.close();
    }
}
