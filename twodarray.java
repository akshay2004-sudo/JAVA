package JAVA;
import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // 2D array
        System.out.print("Enter the size of row : ");
        int r=sc.nextInt();
        System.out.print("Enter the size of column : ");
        int c=sc.nextInt();
        int number[][] = new int[r][c];
        // the outer loop for row;
        for(int i=0;i<r;i++){
            System.out.print("Enter the value :  ");
            // inner loop for column;
            for(int j=0;j<c;j++){ 
                number[i][j]=sc.nextInt();
            }
           
        }
       
        // printing output for the 2D array
         System.out.println("the entered values are :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
         System.out.print("enter the values to be searched : ");
        int x=sc.nextInt();
        // searching the value in 2D array
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(number[i][j]==x){
                    System.out.println("the value is found at index "+i+" "+j);
                }
            }
        }
        sc.close();
    }
    
}
