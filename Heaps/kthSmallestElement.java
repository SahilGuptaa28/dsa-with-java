import java.util.Collection;

class Solution {
    public int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> maxheap =  new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            maxheap.offer(nums[i]);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
     return maxheap.peek();
    }
}