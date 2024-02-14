public class SumOfnNumber {
    public static int sumOf(int n ){
          if(n==1){
            return 1;
          }
          int Snm1 = sumOf(n-1);
          int Sn = n + Snm1;
          return Sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOf(n));
        } 
    }
