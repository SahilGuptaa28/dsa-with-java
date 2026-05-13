class Solution {
    private TreeNode search(TreeNode node,int val){
        if(node == null){
            return null;
        }
        if(val == node.val){
            return node;
        }
        if(val < node.val){
           return search(node.left,val);
        }else{
           return search(node.right,val);
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
       return  search(root,val);
    }
}