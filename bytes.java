package JAVA;
import java.util.*;
public class bytes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value: ");
        int q=sc.nextInt();
        for(int i=1;i<=q;i++){
            for (int j=1;j<=i;j++){// This loop is used to print the pattern
                int sum = i+j;
                if(sum%2==0){//check the odd
                    System.out.print("1 ");
                } else {// check the even
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
        // End of the program
    }
}
