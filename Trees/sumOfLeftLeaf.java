class Solution {
    int sum = 0;
    public void dfs(TreeNode node,boolean flag){
          if(node == null) return;
       dfs(node.left,true);
       if(node.left == null && node.right == null && flag == true)
       sum += node.val;
       dfs(node.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root,false);
        return sum;
    }
}