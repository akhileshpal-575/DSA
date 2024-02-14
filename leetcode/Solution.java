class Solution {
    public static int missingInteger(int[] nums) {
        int sum = nums[0];
        int mx = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length-1;i++){
            if(nums[i] == nums[i-1]+1){
                sum = sum+nums[i];
            }
        }
       return 0;
    }
    public static void main(String[] args) {
        int nums[] = {29,30,31,32,33,34,35,36,37};
        System.out.println(missingInteger(nums));
    }
}