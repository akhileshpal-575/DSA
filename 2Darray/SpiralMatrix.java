public class SpiralMatrix {
    public static void spiralMatrix(int a[][]){
        int sr = 0;
        int er = a.length-1;
        int sc = 0;
        int ec = a[0].length-1;
        while(sr <= er && sr <= sc){
        for (int j = sc; j <= ec; j++) {
            System.out.print(a[sr][j]+" ");
        }
        for (int i = sr+1; i <= er; i++) {
            System.out.print(a[i][ec]+" ");
        }
        for (int j = ec-1; j >=sc; j--) {
             if(sr==er){
                break;
             }
            System.out.print(a[er][j]+" ");
        }
        for (int i = er-1; i >= sr+1; i--) {
            if(sc==ec){
                break;
             }
            System.out.print(a[i][sc]+" ");
        }
        sr++;
        sc++;
        er--;
        ec--;
      }
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20},
                    {21,22,23,24,25}};
    spiralMatrix(a);
    }
}
