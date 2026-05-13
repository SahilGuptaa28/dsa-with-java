class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null)
            return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            boolean presentX = false;
            boolean presentY = false;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if ((node.left != null && node.right != null)) {
                    if ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)) {
                        return false;
                    }
                }
                // check if x and y are present at the current level
                if (node.val == x)
                    presentX = true;
                if (node.val == y)
                    presentY = true;

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            if (presentX && presentY) {
                return true;
            }
        }
        return false;
    }
}