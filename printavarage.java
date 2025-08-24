package JAVA;
import java.util.*;
public class printavarage {
    public static void printavg(int a,int b,int c){
        int z=a+b+c;
        int r=z/3;
        System.out.println(r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b =sc.nextInt();
        System.out.println("enter the value of c : ");
        int c = sc.nextInt();
        printavg(a,b,c);
        sc.close();
    }
    
}
