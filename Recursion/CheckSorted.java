public class CheckSorted {
    public static boolean isSorted(int a[],int i){
        if(i==a.length-1){
            return true; 
        }
        if(a[i] > a[i+1]){
            return false;
        }
       return isSorted(a, i+1);
    }
    public static void main(String[] args) {
        int a[] = {2,4,5,6,8};
      System.out.println(isSorted(a,0)); 
    }
}
