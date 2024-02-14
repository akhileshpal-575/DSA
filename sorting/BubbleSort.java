/**
 * BubbleSort
 */
public class BubbleSort {
    public static void bubbleSort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
          for (int j = 0; j < a.length-1-i; j++) {
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
          }
        }
    }

    public static void main(String[] args) {
        int a[] = { 3,5,2,9,6,8};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}