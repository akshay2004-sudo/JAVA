package JAVA;
import java.util.*;
public class sumOfTwoNumbers {
    public static int CaluculateSum(int q, int r){
        int d =q+r;
        return d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter teh value of q:");
        int q=sc.nextInt();
        System.out.print("enter the value of r:");
        int r=sc.nextInt();
        int d =CaluculateSum(q, r);
        System.out.println("the sum of two number is : "+d);
        sc.close();
    }
}
