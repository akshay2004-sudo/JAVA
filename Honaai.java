package JAVA;

import java.util.Scanner;

public class Honaai {
    public static void tower(int n ,String s,String h ,String d){
        if(n==1){
            System.out.println("move from "+s+" to "+d);
            return;
        }
        tower(n-1,s,h,d);//n-1 disks move from source to helper using destination as helper.
        System.out.println(" move "+n+" from "+s+" to "+d);
        tower(n-1,h,s,d);//n-1 disks move from helper to destination using source as helper.

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of disks:");
        int n=sc.nextInt();
        System.out.println("the steps are:"+n);
        tower(n,"S","H","D");//S=source , H=helper , D=destination.
        sc.close();
    }
    // Your code goes here
}