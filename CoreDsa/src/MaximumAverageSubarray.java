public class MaximumAverageSubarray {

//    LeetCode Problem 643.Maximum Average Subarray I
//    https://leetcode.com/problems/maximum-average-subarray-i/description/
    public static void main(String[] args) {

        int[] arr={1,12,-5,-6,50,3};
        int k=4;
        int [] arr1={5};
        int k1=1;
        System.out.println(findMaxAverage(arr,k));
        System.out.println(findMaxAverage(arr1,k1));
    }
    public static double findMaxAverage(int[] nums, int k){
        if(nums.length==1){
            return (double)nums[0];
        }
        int window=0;
        for (int i = 0; i < k; i++) {
            window+=nums[i];
        }
        int maxsum=window;
        for (int i = k; i < nums.length ; i++) {
            window=window+nums[i]-nums[i-k];
            maxsum=Math.max(window,maxsum);
        }
        return (double)maxsum/k;
    }
}
