/**
 * MergeSort
 */
public class MergeSort {
public static void mergeSort(int a[],int si,int ei){
 if(si>=ei){
    return ;
 }
    int mid = si +(ei - si)/2;
    mergeSort(a,si,mid);//left array
    mergeSort(a,mid+1,ei);//right array
    merge(a,si,mid,ei);
}
public static void merge(int a[],int si,int mid,int ei){
    int temp [] = new int [ei-si+1];
    int i =si; 
    int j =mid+1;
    int k =0;

    while(i<=mid && j<=ei){
        if(a[i]<a[j]){
            temp[k] = a[i]; 
            i++;
        }
        else{
            temp[k] = a[j];
            j++;
        }
        k++;
    }
    // for leftover elements of 1st sorted part.
    while(i<=mid){
        temp[k++]=a[i++];
    }
    // for leftover elements of 2nd sorted part.
    while(j<=ei){
        temp[k++]=a[j++];
    }
    for(k = 0,i= si; k<temp.length; k++,i++){
       a[i] = temp[k];
    }
}
public static void printSortedArray(int a[]){
for (int i = 0; i < a.length; i++) {
     System.out.print(a[i]+" ");    
}
}
    public static void main(String[] args) {
        int a[] = {2 ,13, 4, 1, 3, 6, 28};
        mergeSort(a,0,a.length-1);
        printSortedArray(a);
    }
}