import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }
    public static long fib(int n){
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        return helper(dp,n);

    }
    public static long helper(long[] dp,int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(dp,n-1)+helper(dp,n-2);
        return dp[n];
    }
}
