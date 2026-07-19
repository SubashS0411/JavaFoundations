public class ClimbingStairs2 {
//    Leetcode Problem:746 Min Cost Climbing Stairs
//    https://leetcode.com/problems/min-cost-climbing-stairs/
    public static void main(String[] args) {

//        System.out.println(climbStairsnormal(3));
        System.out.println(climbStairsoptimized(3));
    }
    public static int climbStairsnormal(int n){
        if (n==1) return 1;
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int climbStairsoptimized(int n){
        if (n==1) return 1;
        int step1=1;
        int step2=2;
        for (int i = 3; i <=n ; i++) {
            int currentstep=step1+step2;
            step1=step2;
            step2=currentstep;
        }
        return step2;
    }
}
