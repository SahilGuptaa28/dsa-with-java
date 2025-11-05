/* Given a sorted array, arr[] and a number target,
 you need to find the number of occurrences of target in arr[].  */
 
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
          int n = arr.length; int low = 0; int high = n-1;
        int first = -1; int last = -1;
        while(low<=high){
            int mid  = (low+high)/2;
            if(arr[mid]== target){
                first = mid;
                high = mid-1;
            }else if(arr[mid]>target){
               high = mid-1;
            }else{
                low = mid+1;
            }
        }
        int l=0; int h = n-1;
         while(l<=h){
            int mid  = (l+h)/2;
            if(arr[mid]== target){
                last  = mid;
               l = mid+1;
            }else if(arr[mid]>target){
               h = mid-1;
            }else{
                l = mid+1;
            }
        }
    
       if(first == -1 ) return 0;
       return last-first+1;
    }
}

