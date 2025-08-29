package JAVA;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        int k[] = new int [s];
        for(int i=0;i<s;i++){
            System.out.println("Enter the value of "+i+" index");
            k[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be searched");
        int x=sc.nextInt();
        for(int i=0;i<k.length;i++){
            if(k[i]==x){
                System.out.println("the value is found at index "+i);
            }
            System.out.println("the enterd array are "+k[i]);
        }
        sc.close();
    }
    
}
