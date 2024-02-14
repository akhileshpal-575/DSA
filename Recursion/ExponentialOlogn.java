/**
 * ExponentialOlogn
 */
public class ExponentialOlogn {
public static int powOf(int x, int n){
    // time complexity O(logn).
    if(n==0){
        return 1;
    }
    int halfpow = powOf(x , n/2);
    int halfpowSq = halfpow * halfpow;

    // n is odd
    if(n%2!=0){
        halfpowSq = x * halfpowSq;
    }
    return halfpowSq;
}
    public static void main(String[] args) {
        int  x = 2;
        int n = 10;
        System.out.println(powOf(x,n));
    }
}