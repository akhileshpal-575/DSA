public class Comparision {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        
        // s1 and s2 are equal beause s2 point the same string s1 in memory.
        // and comparing same string by diff variable.
        // if(s1 == s2){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("unequal");
        // } 
        
        // // s1 and s3 not equal because s3 string "Tony" is new Tony.
        // if(s1 == s3){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("unequal");
        // }
        // Here the main reason is that == compare string as object level , that by s1 and s3 are different.
        // for comparing string as value level then use following method.

        if(s1.equals(s3)){//return a boolean value.
        System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
              

    }
}
