//https://leetcode.com/problems/find-pivot-index/description/
//Problem724
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] Elements = {1,7,3,6,5,6};
        System.out.println(pivotIndex(Elements));
    }
    public static int pivotIndex(int[] nums){
        int sum=0;
        for (int num:nums){
            sum+=num;
        }
        int leftsum=0;
        for (int i = 0; i < nums.length; i++) {
            int rightsum=sum-leftsum-nums[i];
            if(leftsum==rightsum) return  i;
            leftsum+=nums[i];

        }
        return -1;
    }
}
