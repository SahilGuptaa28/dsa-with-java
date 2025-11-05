/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity. */



class Solution {
    public int searchInsert(int[] nums, int target) {
       int n = nums.length; int low = 0;int high = n-1;
       while(low<=high){
        int mid = low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]<target){
            low = mid+1;
        }else{
            high = mid-1;
        }
       }
    return low;      
    }
}

// The Lower bound also works in this.