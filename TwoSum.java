import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
     HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
         int complement = target - nums[i];
         if(map.containsKey(complement)){
            return new int[] {map.get(complement)+1,i+1};
         }else{
            map.put(nums[i],i);
         }
        }
       return new int[]{};

    }
}


public class TwoSum {
    public static void main(String[] args) {
        int[] a= {2, 7, 11, 15};
        Solution s = new Solution();
        int[] b= s.twoSum(a, 9);
        System.out.println(Arrays.toString(b));
    }
}
