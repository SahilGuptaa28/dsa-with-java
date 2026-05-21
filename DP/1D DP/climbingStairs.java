 // memoization  
   class Solution {
        public int solve(int idx,int[] dp){
            if(idx<=1) return 1;
            if(dp[idx] != -1) return dp[idx];
            int left = solve(idx-1,dp);
            int right = solve(idx-2,dp);
            return dp[idx]=left+right;
        }
        public int climbStairs(int n) {
            int[] dp = new int[n+1];
            Arrays.fill(dp,-1);
            return solve(n,dp);
        }
    }
// tabulation
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}