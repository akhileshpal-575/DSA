public class LastOccurence {
    public static int lastOccrence(int a[],int key,int i){
        if(i == a.length){
            return -1;
        }
        int isFound = lastOccrence(a, key, i+1);
        if(isFound == -1 && a[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int a[] = {8,3,6,9,5,10,2,5,3};
        int val = 5;
        int index = lastOccrence(a,val,0);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("found at index : "+index );
        }
    }
}
