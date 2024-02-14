/**
 * RecursionBasic
 */
public class RecursionBasic {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
              return ;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        // printing decreasing series from n to 1.
        System.out.println("number from "+n+" to 1");
        printDec(n);
        System.out.println();
        System.out.println("number from 1 to "+n);
        // printing decreasing series from 1 to 2.
        printInc(n);
    }
}