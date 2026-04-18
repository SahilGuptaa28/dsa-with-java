class Solution {
    public void findCombinations(int arr[], int idx, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (idx == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombinations(arr, idx + 1, target - arr[idx], ans, ds);
            ds.remove(ds.size() - 1);
        }
        while (idx + 1 < arr.length && arr[idx] == arr[idx + 1]) {
            idx++;
        }
        findCombinations(arr, idx + 1, target, ans, ds);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, 0, target, ans, ds);
        return ans;
    }
}