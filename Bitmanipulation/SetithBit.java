public class SetithBit {
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
          // Set ith bit.
        int a = 10;
        System.out.println(setIthBit(a,2));
    }
}
