public class SelectionSort {
    public static void selectionSort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[minpos]>a[j]){
                    minpos = j;
                }
            } 
            int temp = a[minpos];
            a[minpos] = a[i];
            a[i] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {2,6,4,3,7,8,1};
        selectionSort(a);
    }
}
