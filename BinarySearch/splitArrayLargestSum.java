// same question on gfg "Allocate Minimum Pages" && "The Painter's Partition Problem-II".
class Solution {
     public int CountSubArray(int[] arr,int sum){
        int subArray = 1; int subArraySum = 0;
        for(int i=0;i<arr.length;i++){
            if(subArraySum+arr[i]<=sum){
               subArraySum+=arr[i];
            }else{
               subArray++;
                subArraySum = arr[i];
            }
        }
        return subArray;
    }
    public int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int totalSum = 0;
        for(int i:nums){
            max = Math.max(i,max);
            totalSum +=i;
        }
        int low = max; int high = totalSum;
        int ans = max;
        while(low<=high){
            int mid = low +(high-low)/2;
            int s =CountSubArray(nums,mid);
            if(s<=k) {
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
           
        }
        return ans;
    }
}