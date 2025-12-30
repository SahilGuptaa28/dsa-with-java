class Solution {
    // function to return the power.
    public int power(int mid,int n,int m){
        long ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans*mid;
            if(ans>m) return 2;
        }
         if(ans==m) return 1;
     return 0;
    }
    public int nthRoot(int n, int m) {
        // code here
        if(m==1 || m==0) return m;
        int low = 1;int high = m;
        while(low<=high){
            int mid = low + (high-low)/2;
            int ans = power(mid,n,m);
            if(ans == 1) return mid;
            else if(ans == 2){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
