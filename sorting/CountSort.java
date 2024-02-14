public class CountSort {
    public static void countSort(int a[]) {
        //find max in given array.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        //count size is max+1.
        int count[] = new int[max + 1];

        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        
        for (int i = 0; i < a.length; i++) {
            count[a[i]] = count[a[i]] + 1;
        }
        int i = 0; // for count array.
        int j = 0; // for given array.
        
        while(i<=max){
            if(count[i]>0){
                a[j] = i;
                j++;
                count[i] = count[i] - 1;
            }
            else{
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int a[] = { 7, 8, 2, 1, 9, 5, 2 };
        countSort(a);
        System.out.println("sorted array :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
