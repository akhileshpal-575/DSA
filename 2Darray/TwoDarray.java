import java.util.Scanner;
/**
 * TwoDarray
 */
public class TwoDarray {

    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int a[][] = new int [2][2];
          for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
          }
          for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
          }
      }
          
    }
}