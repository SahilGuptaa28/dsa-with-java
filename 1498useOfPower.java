// q no 1498 how to make power of 2

class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1_000_000_007;
        Arrays.sort(nums);

        int n = nums.length;
        int[] pow = new int[n];
        pow[0] = 1;

        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % mod;
        }

        int l = 0, r = n - 1;
        int count = 0;

        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                count = (count + pow[r - l]) % mod;
                l++;
            } else {
                r--;
            }
        }

        return count;
    }
}

