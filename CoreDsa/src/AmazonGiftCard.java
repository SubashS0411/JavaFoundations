import java.util.Arrays;

public class AmazonGiftCard {
//    167. Two Sum II - Input Array Is Sorted
//    https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while (left<=right){
            int current=numbers[right]+numbers[left];

            if(current==target) return new int[]{left,right};
            else if (current>right) {
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
        }
}
