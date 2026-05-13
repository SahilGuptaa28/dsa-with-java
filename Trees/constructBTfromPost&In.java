class Solution {
    int preIndex;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode build(int[] postorder, int left, int right) {
        if (left > right)
            return null;
        int rootVal = postorder[preIndex--];
        int index = map.get(rootVal);
        TreeNode node = new TreeNode(rootVal);
        node.right = build(postorder, index + 1, right);
        node.left = build(postorder, left, index - 1);

        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0)
            return null;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        preIndex = postorder.length - 1;
        return build(postorder, 0, postorder.length - 1);
    }
}