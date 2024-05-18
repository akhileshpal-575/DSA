public class Direction {
    public static float shortPathDirection(String str){
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else {
                y--;
            } 
        }  
        int x2 = x*x;
        int y2 = y*y;
        float distance = (float) Math.sqrt(x2+y2);
        return distance;
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortPathDirection(str));
    }
}
