 public int maxDepth(TreeNode root) {
        if(root == null) return 0;
         int left = maxDepth(root.left);
         int right = maxDepth(root.right);

         int depth = Math.max(left,right)+1;
         return depth;
    }

// need to use global variable to store max depth
class Solution {
    int maxCount = Integer.MIN_VALUE;
    public void dfs(TreeNode node,int count){
        if(node == null){
             maxCount = Math.max(count,maxCount);
            return;
        }
        count++;
        dfs(node.left,count);
        dfs(node.right,count);
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
         dfs(root,0);
        return maxCount;
    }
}