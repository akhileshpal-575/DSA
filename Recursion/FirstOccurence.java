/**
 * FirstOccurence
 */
public class FirstOccurence {
    public static int firstOccrence(int a[],int key, int i){
     
        if(i == a.length){
            return -1;
        }
        if(a[i] == key){
            return i;
        }
       return firstOccrence(a, key, i+1);
    }
public static void main(String[] args) {
    int a[] = {8,3,6,9,5,10,2,5,3};
    int val = 5;
    int index = firstOccrence(a,val,0);
    if(index==-1){
        System.out.println("Not found");
    }
    else{
        System.out.println("found at index : "+index );
    }
}
}