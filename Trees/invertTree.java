class Solution {
    public TreeNode invert(TreeNode node){
       if (node == null) return null;

    TreeNode left = invert(node.left);
    TreeNode right = invert(node.right);

    node.left = right;
    node.right = left;

    return node;
    }
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
}