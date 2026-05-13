class Solution {
    private boolean sum(TreeNode node, int targetSum,int currSum) {
        if (node == null)
            return false ;
            currSum += node.val;
          if(node.left== null && node.right == null){
            return currSum == targetSum;
          }
        return sum(node.left,targetSum,currSum) || sum(node.right,targetSum,currSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root,targetSum,0);
    }
}