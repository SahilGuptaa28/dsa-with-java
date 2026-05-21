class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // bubble sort style
        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){

                int freq1 = map.get(nums[i]);
                int freq2 = map.get(nums[j]);

                // smaller frequency first
                // if same frequency -> bigger number first
                if(freq1 > freq2 || 
                  (freq1 == freq2 && nums[i] < nums[j])){

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}