class Solution {
     int minCount = Integer.MAX_VALUE;
    public void dfs(TreeNode node,int count){
        if(node == null){
            return;
        }
        count++;
        // update when you are at leaf node
        if(node.left == null && node.right == null){
            minCount = Math.min(minCount, count);
            return;
        }
        dfs(node.left,count);
        dfs(node.right,count);
    }
    public int minDepth(TreeNode root) {
         if(root == null) return 0;
         dfs(root,0);
        return minCount;
    }
}