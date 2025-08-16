package JAVA;
import java.util.*;
public class patteren2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int a=sc.nextInt();
        System.out.println("enter the number of coloumn ");
        int b=sc.nextInt();
        // Printing the pattern
        // Outer loop for rows
        for(int i=1;i<=a;i++){
            //inner loop for the column
            for(int j=1;j<=b;j++){
                if(i == 1|| j== 1||i ==a||j == b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
    
}
