// Recovery of Binary Search Tree by swapping two nodes
class Solution {
    public TreeNode prev = null;
    public TreeNode first = null;
    public TreeNode last = null;
    public TreeNode mid = null;

    public void solve(TreeNode node){
        if(node == null) return;

        solve(node.left);

        if(prev != null && prev.val > node.val){

            // first violation
            if(first == null){
                first = prev;
                mid = node;
            }
            // second violation
            else{
                last = node;
            }
        }

        prev = node;

        solve(node.right);
    }

    public void recoverTree(TreeNode root) {
        solve(root);

        // non-adjacent swap
        if(first != null && last != null){
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }

        // adjacent swap
        else if(first != null && mid != null){
            int temp = first.val;
            first.val = mid.val;
            mid.val = temp;
        }
    }
}