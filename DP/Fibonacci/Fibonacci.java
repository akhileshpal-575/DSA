package DP.Fibonacci;

public class Fibonacci {
    // Recursive approach
    // public static int fib(int n){
    //     // Base case
    //     if(n==1||n==0){
    //         return n;
    //     }
    //     return fib(n-1) + fib(n-2);
    // }

    // DP -> Memoization (top down approach)
    public static int fibDp(int n,int[] dp){
        // Base case
        if(n==1||n==0){
            return n;
        }
        if(dp[n]!=0){  //already calculated
            return dp[n];
        }

        dp[n] = fibDp(n-1,dp) + fibDp(n-2,dp);
        return dp[n];
    }
    // // Dp Tabulation approach ( bottom up)
    // public static int fibDp(int n){
    //     int []dp = new dp[n+1];
    //     dp[1] = 1;
    //     for(int i =2;i<=n;i++){
    //         dp[i] = dp[i-1]+dp[i-2];
    //     }
    //     return dp[n];
    // }
    public static void main(String[] args) {
        int n = 5;
        // System.out.println(fib(n));
        int []dp = new int[n+1];
        System.out.println(fibDp(n,dp));
        // System.out.println(fibDpTabulation(n));
    }
}
