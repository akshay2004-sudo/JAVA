package JAVA;

import java.util.Scanner;

public class re {
public static void PrintW(int a,int b,int n){
    if(a==b){
        n =++a;
        System.out.println(a);
    }
n=++a;
PrintW(a,b,n);
}    
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of value ");
    int a=sc.nextInt();
    System.out.println("enter the bumber of elements");
    int b=sc.nextInt();
    System.out.println("enter the intial sum");
    int n=sc.nextInt();
    PrintW(a,b,n);
    sc.close(); 
}
}
