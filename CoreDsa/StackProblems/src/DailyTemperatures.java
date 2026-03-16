import java.util.Arrays;
import java.util.Stack;
//Leetcode problem:739-Daily Temperatures
//https://leetcode.com/problems/daily-temperatures/description/
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr={73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
//            int current=temperatures[i];
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index=stack.pop();
                result[index]=i-index;
            }
            stack.push(i);
        }
        return result;
    }
}
