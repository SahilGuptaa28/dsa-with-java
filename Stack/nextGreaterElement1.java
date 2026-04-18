class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];

        for(int i=nums2.length-1;i>=0;i--){
             while(!s.isEmpty() && s.peek()<=nums2[i]){
                    s.pop();
             }
             int ng = (s.isEmpty()) ? -1 : s.peek();
             map.put(nums2[i],ng);

             s.push(nums2[i]); 
        }
        int x = 0;
        for(int i=0;i<nums1.length;i++){
            res[x++] = map.get(nums1[i]);
        }
       return res;
    }
}