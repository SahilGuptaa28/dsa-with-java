class Solution {
    public boolean canWePlace(int[] arr, int dist, int k) {
        int countCows = 1;
        int last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                countCows++;
                last = arr[i];
            }
            if (countCows >= k)
                return true;
        }
        return false;
    }

    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

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