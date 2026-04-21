  
public class Solution {
    public static int sum(int[] arr, int idx, int sum, int tar) {
        if (idx == arr.length) {
            return (sum == tar) ? 1 : 0;
        }

        // include current element
        int take = sum(arr, idx + 1, sum + arr[idx], tar);

        // exclude current element
        int notTake = sum(arr, idx + 1, sum, tar);

        return take + notTake;
    }

    public static int findWays(int num[], int tar) {
        return sum(num, 0, 0, tar);
    }
}