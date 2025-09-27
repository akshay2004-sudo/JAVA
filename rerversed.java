package JAVA;

import java.util.Scanner;

public class rerversed {
    public static void rew(String s,int i){
        if(i==0){
            System.out.println(s.charAt(i));
            return;
        }
        System.out.print(s.charAt(i));
        rew(s,i-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        rew(s,s.length()-1);
        sc.close();
    }
}
