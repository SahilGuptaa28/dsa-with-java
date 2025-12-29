
// Same code as min in Rotated Sorted array just find the index of min is the required ans.


class Solution {
    public int findKRotation(int arr[]) {
       int low = 0; int high = arr.length-1;
       int min = Integer.MAX_VALUE;
       int k= 0;
       while(low<=high){
           int mid = (low+high)/2;
           if(arr[low]<=arr[high]){
               if(arr[low]<min){
                   k = low;
                   min = arr[low];
               }
               break;
           }
           if(arr[low]<=arr[mid]){
              if(arr[low]<min){
                   k = low;
                   min = arr[low];
              } 
              low = mid+1;
           }else{
              
                if(arr[mid]<min){
                   k = mid;
                   min = arr[mid];
              }
               high = mid-1;
           }
       }
       return k;
    }
}
