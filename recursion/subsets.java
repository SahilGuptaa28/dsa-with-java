// Generate All the subsets;

class Solution {
    public void generateSubsets(int[] arr,int idx,List<List<Integer>> ans,List<Integer> ds){
        if(idx == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[idx]);
        generateSubsets(arr,idx+1,ans,ds);
        ds.remove(ds.size()-1);
        generateSubsets(arr,idx+1,ans,ds);
        return;

    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> ds = new ArrayList<>();
           generateSubsets(nums,0,ans,ds);
           return ans;
    }
}

// loop based
public void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
    result.add(new ArrayList<>(current));

    for (int i = start; i < nums.length; i++) {
        current.add(nums[i]);

        backtrack(i + 1, nums, current, result);

        current.remove(current.size() - 1);
    }
}