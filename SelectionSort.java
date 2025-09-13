package JAVA;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int r=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[r];
        for(int i=0;i<r;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        //selection sort
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){ 
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            //swap
            int temp =arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close(); 
    }
    
}
