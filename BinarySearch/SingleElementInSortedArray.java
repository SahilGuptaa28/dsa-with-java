/*The array is sorted, and all elements except one appear exactly twice. If we observe carefully, 
every pair starts at even index and ends at odd index when the array is still balanced
 (i.e., before the unique element is encountered).
But once the unique element is inserted, this pairing pattern breaks and the shift happens after
 that unique element. So we can use this pattern to cut the search space in half using binary search: */
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
       if(n==1) return nums[0];
       if(nums[0]!=nums[1]) return nums[0];
       if(nums[n-1]!=nums[n-2]) return nums[n-1];
       int low = 1; int high = n-2;
       while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]!= nums[mid-1] && nums[mid]!= nums[mid+1]){
            return nums[mid];
        }
        else if((mid % 2 == 1 && nums[mid]==nums[mid-1] ) || 
        (mid % 2 == 0 && nums[mid]==nums[mid+1] )){
            low = mid+1;
        }else{
            high = mid-1;
        }
       }
       return -1;
    }
}
