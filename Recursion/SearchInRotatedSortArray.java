public class SearchInRotatedSortArray {
    public static int search(int a[],int tar,int si,int ei){
    if(si>ei){
        return -1;
    }
    int mid = si + (ei-si)/2;
    // case found
    if(a[mid]==tar){
        return mid;
    }
    // mid on L1
    if(a[si]<=a[mid]){
        // case a: left
        if(a[si]<=tar&&tar<=a[mid]){
            return search(a, tar, si, mid-1);
        }
        else{
            return search(a, tar, mid+1, ei);
        }
    }
    // mid on L2
    else{
        // case c: right
        if(a[mid]<=tar&&tar<=a[ei]){
            return search(a, tar, mid+1, ei);
        }
        else{
            return search(a, tar, si, mid-1);
        }
      }
    }
    public static void main(String[] args) {
        int a[] = {4,5,6,7,0,1,2};
        int idx = search(a,0,0,a.length-1);
        System.out.println(idx);
    }
}
