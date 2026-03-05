import static java.util.Collections.min;

public class ContainerWithMostWater {
//    LeetCode Problem 11
//    https://leetcode.com/problems/container-with-most-water/description/
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height){
        int left=0,right=height.length-1;
        int maxwater=0;
        while(left<right){
            int currentWater=(right-left)*Math.min(height[left],height[right]);
            maxwater=Math.max(maxwater,currentWater);
            if(height[left]<height[right]) left++;
            else right--;

        }
        return maxwater;
    }
}
