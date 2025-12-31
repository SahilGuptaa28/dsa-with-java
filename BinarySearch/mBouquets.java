
// Leetcode 1482. BS on answers.
class Solution {
     public boolean possible(int[] arr,int value,int m,int k){
        int count = 0;
        int noOfBouquets = 0;
        for(int i : arr){
            if(i<=value){
                 count ++;
            }else{
                noOfBouquets += (count/k);
                count = 0;
            }
        }
         noOfBouquets += (count/k);
         if(noOfBouquets>=m){
            return true;
         }
         return false;
     }

    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length){
            return -1;
        }
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for(int i : bloomDay){
            minDay = Math.min(minDay,i);
            maxDay = Math.max(maxDay,i);
        }
        int low = minDay; int high = maxDay;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                    ans = mid;
                    high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
