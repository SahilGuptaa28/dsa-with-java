
// BS on answers
class Solution {
    public boolean checkDays(int[] arr,int val,int days){
         int d = 1;
         int k = 0;
        for(int i=0;i<arr.length;i++){
         if(k+arr[i]>val){
            d++;
            k = arr[i];
         }else{
           k+=arr[i];
         }
           
        }
         if(d<=days) return true;

            return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = Integer.MIN_VALUE;
        int totalWeight = 0;
        for(int i:weights){
            maxWeight = Math.max(maxWeight,i);
            totalWeight +=i;        
        }
        int low = maxWeight; int high = totalWeight;
        int ans = maxWeight;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(checkDays(weights,mid,days)){
                 ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;

    }
}