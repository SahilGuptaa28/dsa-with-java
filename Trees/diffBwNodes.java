class Solution {
    int ans = Integer.MAX_VALUE;
     Integer prev = null;
    private void dfs(TreeNode node){
        if(node == null) return;
        dfs(node.left);
        if(prev != null){
       ans = Math.min(ans,node.val-prev);
        }
        prev = node.val;
        dfs(node.right);
    }
    public int minDiffInBST(TreeNode root) {
         dfs(root);
        return ans;
    }
}