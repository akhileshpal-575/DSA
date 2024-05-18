public class Substring {
    // public static String subString(String str , int si , int ei){
    //     String substr = "";
    //     for (int i = si; i < ei; i++) {
    //         substr += str.charAt(i);
    //     }
    //     return substr;
    // }
    public static void main(String[] args) {
        // substring 
        String str = "HelloWorld";
        // System.out.println(subString(str,0,5));
        
        // java already have a substring function.
        String substr = str.substring(0,5);
        System.out.println(substr);
    }
}
