public class KnapsackProblem {

// Recursive code 
 //     static int knapsackRecursion(int []val,int[] wt,int W,int n){ //2^n TC
//         if(W==0||n==0){
//             return 0;
//         }
//         if(wt[n-1]<=W){ // valid
//             // include
//             int ans1 = val[n-1] + knapsackRecursion(val, wt, W-wt[n-1], n-1);
//             //exclude
//             int ans2 = knapsackRecursion(val, wt, W, n-1);
//             return Math.max(ans1,ans2);
//         }else{//not valid
//             return knapsackRecursion(val, wt, W, n-1);
//         }
//     }

//  0/1 knapsack using Dp (memoization approach)
    // static int knapsackDP(int []val,int[] wt,int W,int n,int [][]dp){ //2^n TC
    //     if(W==0||n==0){
    //         return 0;
    //     }
    //     if(dp[n][W]!=-1){
    //         return dp[n][W];
    //     }
    //     if(wt[n-1]<=W){ // valid
    //         // include
    //         int ans1 = val[n-1] + knapsackDP(val, wt, W-wt[n-1], n-1,dp);
    //         //exclude
    //         int ans2 = knapsackDP(val, wt, W, n-1,dp);
    //         dp[n][W] = Math.max(ans1,ans2);
    //         return dp[n][W];
    //         }else{//not valid
    //         dp[n][W] = knapsackDP(val, wt, W, n-1,dp);
    //         return dp[n][W];
    //     }
    // }
    public static int knapsackTab(int []val,int []wt, int W){
        int n = val.length;
        int dp [][] = new int[n+1][W+1];
        for(int i = 0; i<n+1; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j<W+1; j++){
            dp[0][j] = 0;
        }

        for(int i = 1;i<n+1;i++){
            for(int j = 1; j<W+1; j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w<=j){
                    dp[i][j] = Math.max((v+dp[i-1][j-w]),dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i =0; i<dp.length;i++){
            for(int j =0;j<dp[0].length; j++){
                  dp[i][j] = -1;
            }
        }
    // System.out.println(knapsackRecursion(val,wt,W,val.length));
    // System.out.println(knapsackDP(val, wt, W,val.length,dp));
       System.out.println(knapsackTab(val, wt, W));
    }
}
