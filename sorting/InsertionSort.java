/**
 * InsertionSort
 */
public class InsertionSort {
    public static void insertionSort(int a[]){
      for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int prev = i-1;
            while(prev >= 0 && a[prev] > curr){
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        
        int a[] = {3,6,4,2,8,1,5};
        insertionSort(a);
        System.out.println("sorted array :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}