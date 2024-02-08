public class NumIsPowOfTwo {
    public static void checkNumIsPowOfTwo(int n){
     if((n&(n-1))==0){
        System.out.println("Number is power of two");
     }
     else{
        System.out.println("Number is not power of two");
     }
    }
    public static void main(String[] args) {
       int n = 15;
        checkNumIsPowOfTwo(n);
    }
}
