/**
 * Palindrome
 */
public class Palindrome {
public static void palindrome(String str){
    boolean t = true;
    for (int i = 0; i < str.length()/2; i++) {
        if(str.charAt(i)!= str.charAt(str.length()-1-i)){
            System.out.println("Not Palindrome");
            t = false;
            break;
        }
    }
    if(t){
        System.out.println("Palindrome");
    }
}
    public static void main(String[] args) {
         String str = "racecar";
    palindrome(str);
    }
}