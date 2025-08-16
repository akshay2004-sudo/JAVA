package JAVA;
import java.util.*;
//half inverted piramid pattern
public class pattren3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the w value: ");
        int w = sc.nextInt();
        /*for(int a=w;a>=1;a--){//for(int i=1;i<=w;i++){for(int j=1j<=i;j++){
        System.out.println("*");}
        System.out.println();} for forward piramid
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //rotated piramid pattern
        for(int i=1;i<=w;i++){
            for(int j=1;j<=w-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        // End of the program
    }
    
}
