class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        Stack<Integer>  s = new Stack<>();
        for(int i= 2*n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<= nums[i % n]){
                s.pop();
            }
            if(i<n){
                int nge = s.isEmpty() ? -1 : s.peek();
                res[i] = nge; 
            }
            s.push(nums[i % n]);
        }
        return res;
    }
}