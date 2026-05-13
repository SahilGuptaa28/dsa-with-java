class Solution {
    public TreeNode solve(TreeNode node, TreeNode p, TreeNode q){
        if(node == null){
            return null;
        }
        if(node == p || node == q){
            return node;
        }
      TreeNode left =  solve(node.left,p,q);
      TreeNode right = solve(node.right,p,q);
      if(left != null && right != null){
        return node;
      }
      if(left == null){
        return right;
      }else{
        return left;
      }
    
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return solve(root,p,q);
    }
}