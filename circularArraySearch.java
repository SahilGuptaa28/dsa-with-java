// q no 2515

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int directDist = Math.abs(i - startIndex);
                int circularDist = n - directDist;

                minDist = Math.min(minDist, Math.min(directDist, circularDist));
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}



  public void findCombination(int ind, int target, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        // Base case: If the target becomes 0, we found a valid combination
        if (target == 0) {
            ans.add(new ArrayList<>(ds));  // Add the current combination to the result
            return;
        }

        // Loop through the elements starting from index 'ind'
        for (int i = ind; i < arr.length; i++) {
            // Skip duplicates to avoid repeating combinations
            if (i > ind && arr[i] == arr[i - 1]) continue;

            // If the current element is greater than the remaining target, break the loop
            if (arr[i] > target) break;

            // Include the current element in the combination
            ds.add(arr[i]);

            // Recur with the updated target and next index (i + 1 to avoid repetition)
            findCombination(i + 1, target - arr[i], arr, ans, ds);

            // Backtrack by removing the last added element
            ds.remove(ds.size() - 1);
        }
    }
 