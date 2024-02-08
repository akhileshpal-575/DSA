public class GetithBit {
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0)
         return 0;
         else 
         return 1;
    }
    public static void main(String[] args) {
        // Get ith bit.
        int n = 15;
        System.out.println(getIthBit(n,3));
    }
}
