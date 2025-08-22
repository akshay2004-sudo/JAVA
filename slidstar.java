package JAVA;
import java.util.*;
public class slidstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars to be printed:");
        int u=sc.nextInt();
        for(int i=1;i<=u;i++){
            for(int j=1;j<=u-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=u;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
