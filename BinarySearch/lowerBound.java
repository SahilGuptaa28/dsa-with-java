/*Given a sorted array arr[] and a number target, the task is to find the lower bound of the target in this given array. The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the given number.

Note: If all the elements in the given array are smaller than the target, the lower bound will be the length of the array.  */

// Brute-force
class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
      for(int i=0;i<arr.length;i++){
          if(arr[i]>=target) return i;
      }
       return arr.length;
    }
}
// Optimal using BS

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
}
