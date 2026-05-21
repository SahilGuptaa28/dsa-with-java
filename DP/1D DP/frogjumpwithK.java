import java.util.Arrays;

class Solution {

    public int solve(int idx, int k, int[] dp){

        if(idx == 0){
            return 1;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int ways = 0;

        for(int jump = 1; jump <= k; jump++){

            if(idx - jump >= 0){
                ways += solve(idx - jump, k, dp);
            }
        }

        return dp[idx] = ways;
    }

    public int climbStairs(int n, int k) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return solve(n, k, dp);
    }
}