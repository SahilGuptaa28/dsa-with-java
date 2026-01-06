class Solution {
    public boolean canWePlace(int[] arr, int dist, int k) {
        int countCows = 1;
        int last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                countCows++;
                last = arr[i];
            }
            if (countCows >= k)
                return true;

            return false;
        }
    }

    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : stalls) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int low = min;
        int high = max;
        int ans = max - min;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canWePlace(stalls, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;

    }
}