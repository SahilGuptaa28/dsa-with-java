// same as 3sum, just add one more loop
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) 
                    continue;
                int l = j + 1;
                int h = nums.length - 1;
                while (l < h) {
                    long sum =(long) nums[i] + nums[j] + nums[l] + nums[h];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[h]);
                        res.add(list);
                        l++;
                        h--;
                        while (l < h && nums[l] == nums[l - 1])
                            l++;
                        while (l < h && nums[h] == nums[h + 1])
                            h--;
                    } else if (sum> target) {
                        h--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}