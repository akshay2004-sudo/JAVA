package JAVA;

public class BM {
    public static void main(String[] args) {
        int n=5;//in bit valur 1010
        int r=2;//position of the bit if it is 3 it is zero
        int bm=1<<r;//bit mask
        //AND OPERATOR
       /*  if((n&bm)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }*/
        //or operator
      /*   if((n|bm)==n){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
        int nm=bm |n;
        System.out.println(nm);
    */
    //AND WITH NO OPERATOR
    int newbm=~(bm);
    int newn=n&newbm;
    System.out.println(newn);
    }
}
