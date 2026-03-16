import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement{
    public static void main(String[] args) {
        int[] arr={1,5,7,8};
        System.out.println(Arrays.toString(findNextGreater(arr)));
    }
    public static int[] findNextGreater(int[] nums){
        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                int index=stack.pop();
                result[index]=nums[i];
            }
            stack.push(i);
//            System.out.println(stack);
        }
        return result;
    }
}
