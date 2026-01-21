//. BS on answers.
class Solution {
     public long TimeRequired(int[] arr,int banana){
         long timeRequired =0;
        for(int i=0;i<arr.length;i++){
             timeRequired += (int)Math.ceil((double)arr[i]/banana);
        }
       return timeRequired;
     }
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        // Taking the maximum value of bananapile which will always be an answer;
       for(int x : piles) max = Math.max(max, x);
       // applying BS on answer to find the minimum answer; 
       int low = 1 ; int high = max;
       int ans = max;
       while(low<=high){
        int mid = (low+high)/2;
        long totalTime = TimeRequired(piles,mid);
        if(totalTime<=h){
            ans = mid;
            high = mid-1;
        }else{
            low= mid+1;
        }
       }
    return ans;
    }
}