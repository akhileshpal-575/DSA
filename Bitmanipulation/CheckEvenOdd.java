/**
  * CheckEvenOdd
  */
 public class CheckEvenOdd {
public static void evenOdd(int a){
    int bitMask = 1;
    if((a & bitMask) == 1){
        System.out.println("odd");
    }
    else{
        System.out.println("even");
    }
 }
    public static void main(String[] args) {
        int n = 6;
        evenOdd(n);
    }
 }