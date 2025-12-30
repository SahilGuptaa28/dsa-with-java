class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1)return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        for(int i=1;i<=n-2;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;
    }
}


// optimize Solution 
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1)return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int low = 1; int high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
           if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
            return mid;
            //if mid is increasing the peak is in the right 
           }else if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1]){
            low = mid+1;
            // else left 
           }else{
            high = mid-1;
           }
        }
        return -1;
    }
}
