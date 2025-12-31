
// leetcode 1283. BS on answers.
class Solution {
    public boolean divisor(int[] arr, int num, int threshold){
        int sum = 0; int k = 0;
        for(int i=0;i<arr.length;i++){
           k = (int)Math.ceil((double)arr[i]/num);
           sum += k ;
        }
        if(sum<=threshold){
            return true;
        }
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxNum = Integer.MIN_VALUE;
        for(int i: nums){
            maxNum = Math.max(maxNum,i);
        }
        int low = 1; int high = maxNum;
        int ans = maxNum;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(divisor(nums,mid,threshold)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;

    }
}