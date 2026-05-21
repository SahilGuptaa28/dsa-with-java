// memoization
class Solution {
    public int solve(int[] nums, int idx,int[] dp){
        if(idx == 0) return nums[0];
        if(idx < 0) return 0;
        if(dp[idx] != -1) return dp[idx];
        int pick = nums[idx]+ solve(nums,idx-2,dp);
        int nonPick = solve(nums,idx-1,dp);
        return dp[idx] =  Math.max(pick,nonPick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,n-1,dp);
    }
}
// tabulation
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
         if(n == 1) return nums[0];
        int[] dp = new int[n+1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
// tabulation with space optimization
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
         if(n == 1) return nums[0];
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int curr = Math.max(nums[i]+prev2,prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}