public class Fibonacci {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fibonacci(n-1);
        int f2 = fibonacci(n-2);
        int fb = f1 + f2; 
        return fb;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }
}
