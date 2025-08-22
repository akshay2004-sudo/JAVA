package JAVA;

import java.util.*;

public class palandrom {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of p:");
    int p=sc.nextInt();
    for(int i =1;i<=p;i++){
        for(int j=1;j<=p-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    sc.close();
}
}
