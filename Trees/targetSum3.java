class Solution {
    int count = 0;
     public void helper(TreeNode node,long targetSum){
      if(node == null){
        return;
      }
      targetSum -= node.val;
      if(targetSum == 0){
        count++;
      }
      helper(node.left,targetSum);
      helper(node.right,targetSum); 
        return ;  
     }
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return count;
        helper(root,(long)targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

       return count;
    }
}