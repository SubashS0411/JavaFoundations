import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
//leetcode problem:238
public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4};

        // Correct way to print an array in Java
        int[] result = productExceptSelf(elements);
        System.out.println(Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate left (prefix) products
        // The first element has nothing to its left, so it starts at 1
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate right (suffix) products on the fly and multiply
        // We track the right-side product in a variable, starting at 1
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            // Update the right product for the next iteration (moving leftwards)
            rightProduct = rightProduct * nums[i];
        }

        return result;

    }
}