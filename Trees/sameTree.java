class Solution {
    public boolean same(TreeNode node1,TreeNode node2){
        if (node1 == null || node2 == null) {
        return node1 == node2;
    }
        if(node1.val != node2.val){
            return false;
        }
      boolean left =   same(node1.left,node2.left);
      boolean right =  same(node1.right,node2.right);

        return left && right;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return same(p,q);
    }
}