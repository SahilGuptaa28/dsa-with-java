class Solution {
    int maxSum = Integer.MIN_VALUE;
    private int sum(TreeNode node) {
        if (node == null)
            return 0;
        // if the sum is negative, we can ignore it by taking max with 0
      int l = Math.max(0, sum(node.left));
      int r = Math.max(0, sum(node.right));
     maxSum = Math.max(maxSum, l+r+node.val);
        return Math.max(l,r)+node.val;
    }
}