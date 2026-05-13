class Solution {
    int d = 0;

    private int height(TreeNode node) {
        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        d = Math.max(d, left + right);

        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return d;
    }
}