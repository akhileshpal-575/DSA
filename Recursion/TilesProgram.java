public class TilesProgram {
    public static int tilingProblem(int n) //2xn floor size, same for 4xn and so on.
    {
        if(n == 0 || n == 1){
            return 1;
        }
        // //vertical choice.
        // int fnm1 = tilingProblem(n-1);
        
        // //horizontal choice.
        // int fnm2 = tilingProblem(n-2);

        // int toWays = fnm1 + fnm2;
        // return toWays;
     return tilingProblem(n-1)+tilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
