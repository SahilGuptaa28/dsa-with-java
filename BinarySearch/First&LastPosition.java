/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity. */



class Solution {
     int lowerBound(int[] arr, int target) {
        // code here
      int n = arr.length;
      int low = 0; int high = n-1;
      int ans = n;
      while(low<=high){
          int mid = low + (high-low)/2;
          if(arr[mid]>=target){
              ans = mid;
              high = mid-1;
          }else{
              low = mid+1;
          }
      }
      return ans;
    }
     int upperBound(int[] arr, int target) {
        // code here
        int n = arr.length;int low = 0; int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid]>target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
       int lb = lowerBound(nums,target);
       if(lb==n || nums[lb]!=target){
        return  new int[]{-1,-1};
       }
      return new int []{lb,upperBound(nums,target)-1};
    }
}


// one more way by not using lowerbound and upperbound;

// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int n = arr.length; int low = 0; int high = n-1;
        int first = -1; int last = -1;
        while(low<=high){
            int mid  = (low+high)/2;
            if(arr[mid]== x){
                first = mid;
                high = mid-1;
            }else if(arr[mid]>x){
               high = mid-1;
            }else{
                low = mid+1;
            }
        }
        int l=0; int h = n-1;
         while(l<=h){
            int mid  = (l+h)/2;
            if(arr[mid]== x){
                last  = mid;
               l = mid+1;
            }else if(arr[mid]>x){
               h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return new ArrayList<>(Arrays.asList(first, last));

    }
}
