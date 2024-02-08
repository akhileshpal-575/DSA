public class ClearithBit {

    public static int clearIthBit(int n , int i){
      int bitMask = ~(1<<i);
      return n&bitMask;
    }
    public static void main(String[] args) {
        
        // Clear ith bit.
        int b = 10;
        System.out.println(clearIthBit(b,1));
        
    }
}
