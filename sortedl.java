package JAVA;

import java.util.*;

public class sortedl {
    public static boolean isSort(int ar[],int i){
        if(i==ar.length-1){
            return true;
        }
        if(ar[i]>=ar[i+1]){
            return false;
        }   
        return isSort(ar,i+1);
     /*    if(ar[i]<ar[i+1]){
            return isSort(ar,i+1);
        }else{
            return false;
        }*/
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the list of array");
        int s=sc.nextInt();
        int ar[]={s};
        System.out.println(isSort(ar,0));
        sc.close();
    }
}
