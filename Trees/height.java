//for height based on nodes
private int height(TreeNode node) {
    if (node == null) return 0;

    int left = height(node.left);
    int right = height(node.right);

    return Math.max(left, right) + 1;
}


// for height based on edges
private int height(TreeNode node) {
    if (node == null) return -1;

    int left = height(node.left);
    int right = height(node.right);

    return Math.max(left, right) + 1;
}