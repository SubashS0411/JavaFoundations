public class MinimumSizeSubarraySum  {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;

        System.out.println(minSubArrayLen(target,arr));
        int[] arr1={1,4,4};
        int tar=4;
        System.out.println(minSubArrayLen(tar,arr1));
        int[] arr2={1,1,1,1,1,1,1,1};
        int tar2=11;
        System.out.println(minSubArrayLen(tar2,arr2));
    }
    public static int minSubArrayLen(int target, int[] nums){
        int left=0;
        int windowSum=0;
        int minDays=Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            windowSum+=nums[right];
            while(windowSum>=target){
                int currentWindowSize=right-left+1;
                minDays=Math.min(currentWindowSize,minDays);
                windowSum-=nums[left];
                left++;
            }
        }
        return minDays==Integer.MAX_VALUE?0:minDays;
    }
}
