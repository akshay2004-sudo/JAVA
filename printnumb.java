package JAVA;
import java.util.Scanner;
public class printnumb{
public static void printnmb(int n,int m){
if(n>m){
    return ;
}
System.out.println(n);
printnmb(n+1,m);

}
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println("enter the last element : ");
    int m=sc.nextInt();
    System.out.println("Printing numbers from n to 1");
    printnmb(n,m);
    sc.close();
}
}