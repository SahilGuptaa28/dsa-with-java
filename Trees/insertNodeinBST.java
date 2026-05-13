class Solution {
    private TreeNode insert(TreeNode node,int val){
        if(node == null){
            return new TreeNode(val);
        }
        if(val < node.val){
            node.left = insert(node.left,val);
        }else{
            node.right = insert(node.right,val);
        }
        return node;
    }
 
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insert(root,val);
    }
}