/**
 * Exponential
 */
public class Exponential {
public static int powOf(int x , int n){
// O(n) time compexity.
    if(n==0){
        return 1;
    }
    // int xnm1 = powOf(x, n-1);
    // int xn = x * xnm1;
    // return xn;
    return x * powOf(x, n-1);
}
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int result = powOf(x,n);
        System.out.println(x+"^"+n+" is "+result);
    }
}
