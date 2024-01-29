// Staircase Searching .

public class SearchInSortMatrix {
    public static boolean searchInmatrix(int a[][],int key){
     //start searching from row 0,col m-1. 
       int row = 0 ;      //start
       int col =  a[0].length-1; //end
       while(row<=a.length && col>=0){
        if(key == a[row][col]){
            System.out.println("element "+key+" at a["+row+"]["+col+"]");
            return true;
        }
        //search in bottom
        else if(key>a[row][col]){
            row = row + 1;
        }//search in left side
        else{
            col = col - 1;
        }
       } 
       /*//start searching from row= n-1,col = 0
       int row = a.length-1;
       int col = 0;
       while(col<=a[0].length-1&&row>=0){
        if(key == a[row][col]){
        System.out.println("element "+key+" at a["+row+"]["+col+"]");
            return true;
        }
        else if(key>a[row][col]){
            col = col + 1;
          }
         else{
            row = row - 1;
          }
        }
       */
       return false;
    }
    public static void main(String[] args) {
        int a[][] = {{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
    int key = 33;
    boolean t = searchInmatrix(a,key);                
    if(t)
    System.out.println("Found");
    else
    System.out.println("Not found");
    }
}
