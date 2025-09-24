package JAVA;

import java.util.*;

public class Afactorial {
    public static int printfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factr =printfactorial(n-1);
        int factw=n*factr;
        return factw;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        int a=printfactorial(n);
        System.out.println(a);
        sc.close();
    }
}
