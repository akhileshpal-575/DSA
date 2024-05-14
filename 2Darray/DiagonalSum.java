/**
 * DiagonalSum
 */
public class DiagonalSum {
    public static int diagonalSum(int a[][]){
        int sum = 0;
//O(n) time complexity-best case ,O(n2) for worst case.
        for (int i = 0; i < a.length; i++) {
       //primary diagonal.
            sum += a[i][i];
        //secondary diagonal.    
        if(i!=a.length-1-i)
        sum += a[i][a.length-1-i];   // j = n-1-i;
        }
        return sum;
    }


    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5},
                     {6,7,8,9,10},
                   {11,12,13,14,15},
                   {16,17,18,19,20},
                   {21,22,23,24,25}};
        System.out.println(diagonalSum(a));           
    }
}