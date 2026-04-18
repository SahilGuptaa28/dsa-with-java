// Generate all the subset without duplicates
class Solution {
    public void generateSubsets(int[] arr,int idx,List<List<Integer>> ans,List<Integer> ds){
        if(idx == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        generateSubsets(arr,idx+1,ans,ds);

       while(idx+1 < arr.length && arr[idx] == arr[idx+1]){
        idx++;
       }
        ds.remove(ds.size()-1);
        generateSubsets(arr,idx+1,ans,ds);
        return;

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          Arrays.sort(nums);
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> ds = new ArrayList<>();
           generateSubsets(nums,0,ans,ds);
           return ans;
    }
}
// loop based
 public void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Add current subset to result
        result.add(new ArrayList<>(current));

        // Iterate over array from 'start' index
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;

            // Include nums[i] in current subset
            current.add(nums[i]);

            // Recurse for next index
            backtrack(i + 1, nums, current, result);

            // Backtrack: remove last element
            current.remove(current.size() - 1);
        }
    }