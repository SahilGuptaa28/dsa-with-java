class Solution {

    int ans = 0;

    class Info {
        boolean isBST;
        int sum;
        int min;
        int max;

        Info(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    public Info dfs(TreeNode node) {

        if (node == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info left = dfs(node.left);
        Info right = dfs(node.right);

        if (left.isBST && right.isBST &&
            node.val > left.max &&
            node.val < right.min) {

            int sum = left.sum + right.sum + node.val;

            ans = Math.max(ans, sum);

            int min = Math.min(node.val, left.min);
            int max = Math.max(node.val, right.max);

            return new Info(true, sum, min, max);
        }

        return new Info(false, 0, 0, 0);
    }

    public int maxSumBST(TreeNode root) {
        dfs(root);
        return ans;
    }
}