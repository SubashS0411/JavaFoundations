import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));

        //Optimized version of the previous approach for space complexity
        int prev2 = 0;
        int prev1 = 1;
        int curr = 0;
        for (int i = 2; i <=n; i++) {
            curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(curr);
    }



}
