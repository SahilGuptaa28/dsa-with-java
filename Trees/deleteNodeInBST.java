class Solution {

    // Finds rightmost node in subtree
    public TreeNode dfs(TreeNode node) {

        if (node.right == null) {
            return node;
        }

        return dfs(node.right);
    }

    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        // Node found
        if (root.val == key) {

            // Case 1: Left subtree exists
            if (root.left != null) {

                TreeNode rightMost = dfs(root.left);

                // Attach original right subtree
                if (root.right != null) {
                    rightMost.right = root.right;
                }

                root = root.left;
                return root;
            }

            // Case 2: Leaf node
            else if (root.left == null && root.right == null) {
                return null;
            }

            // Case 3: Only left child
            else if (root.right == null) {
                return root.left;
            }

            // Case 4: Only right child
            else {
                return root.right;
            }
        }

        // Search in right subtree
        else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }

        // Search in left subtree
        else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }

        return root;
    }
}