public class UpdateIthBit {
    public static int updateIthBit(int n,int i,int newbit){
    //  Method 1
    
        if( newbit == 0){
        // clear ith bit.
        int bitMask = ~(1<<i);
        return (n&bitMask);
     }
     else {
        // set ith bit.
        int bitMask = (1<<i);
        return (n|bitMask);
     }
     
    //Method 2
        //   n = n&(~(1<<i));
        //   int bitMask = newbit<<i;
        //   return n|bitMask; 

    }
public static void main(String[] args) {
    System.out.println(updateIthBit(10,2,1));
}    
}
