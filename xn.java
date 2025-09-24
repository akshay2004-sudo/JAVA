package JAVA;
import java.util.*;
//printx^n(stack height = n)
public class xn {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int powq=pow(x,n-1);
        int powe=x*powq;
        return powe;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of x:");
        int x=sc.nextInt();
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        int a=pow(x,n);
        System.out.println(a);
        sc.close();
    }
}
