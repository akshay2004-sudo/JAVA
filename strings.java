package JAVA;
import java.util.*;
public class strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the name");
        //String a=sc.nextLine();
        //System.out.println("Enter the name "+a);
        System.out.print("enter the first name : ");
        String b=sc.nextLine();
        System.out.print("enter the second name : ");
        String c=sc.nextLine();
        String d= b+" "+c;
        System.out.println("the full name is : "+d);
        System.out.println("the length of letter present in the sentance are : "+d.length());
        for(int i=0;i<d.length();i++){
            System.out.println(d.charAt(i));
        }
        if(b.compareTo(c)==0){
            System.out.println("the two names are equal");
        }
        else{
            System.out.println("the two names are not equal");
        }
        sc.close();
    }
}