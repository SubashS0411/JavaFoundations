public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,1}));
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }
    public static int rob(int[] nums){
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int prev1=0;
        int prev2=0;
        for (int i = 0; i < nums.length ; i++) {
            int current=Math.max(nums[i]+prev1,prev2);
            prev1=prev2;
            prev2=current;
        }
        return prev2;
    }
}
