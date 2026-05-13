class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        // Base case
        if (node == null) return 0;

        // Get left height
        int left = height(node.left);
        if (left == -1) return -1; // left subtree unbalanced

        // Get right height
        int right = height(node.right);
        if (right == -1) return -1; // right subtree unbalanced

        // Check current node balance
        if (Math.abs(left - right) > 1) return -1;

        // Return height
        return Math.max(left, right) + 1;
    }
}