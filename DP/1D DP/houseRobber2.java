class Solution {
     public int solve(List<Integer> arr) {
        int n = arr.size();
         if(n == 1) return arr.get(0);
        int prev2 = arr.get(0);
        int prev1 = Math.max(arr.get(0),arr.get(1));
        for(int i=2;i<n;i++){
            int curr = Math.max(arr.get(i)+prev2,prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public int rob(int[] nums) {
          int n = nums.length;
           if (n == 0) return 0;
        if (n == 1) return nums[0];
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0) arr1.add(nums[i]);
            if(i!= n-1) arr2.add(nums[i]);
        }
        return Math.max(solve(arr1),solve(arr2));
    }
}