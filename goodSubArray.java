import java.util.*;
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> modIndex = new HashMap<>();
        modIndex.put(0, -1); 

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum %= k;

            if (modIndex.containsKey(sum)) {
                int prevIndex = modIndex.get(sum);
                if (i - prevIndex >= 2) return true;
            } else {
                modIndex.put(sum, i);
            }
        }

        return false;
    }
}

