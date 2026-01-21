class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0; double maxSum = 0;
        int l=0; int r = k-1;
        for(int i=l; i<=r;i++){
            sum += nums[i];
        }
        maxSum = sum;
        while(r<nums.length-1){
            sum -= nums[l];
            l++;
            r++;
            sum += nums[r];
            maxSum = Math.max(maxSum,sum);
           
        }
        return maxSum/(double)k;
    }
}