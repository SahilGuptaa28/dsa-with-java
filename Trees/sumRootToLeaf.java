// optimized approach
class Solution {
     int sum = 0;
    public void helper(TreeNode node,int curr){
        if(node == null){
            return;
        }
       curr = curr * 10 + node.val;
        if(node.left == null && node.right == null){
            sum += curr;
            return;
        }
        helper(node.left,curr);
        helper(node.right,curr);
    }
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return sum;
    }
}
// using string builder
class Solution {
    StringBuilder sb;  int sum = 0;
    public void helper(TreeNode node){
        if(node == null){
            return;
        }
        sb.append(node.val);
        if(node.left == null && node.right == null){
            String s = sb.toString();
            sum += Integer.parseInt(s);
            sb.deleteCharAt(sb.length()-1);
            return;
        }
        helper(node.left);
        helper(node.right);
        sb.deleteCharAt(sb.length()-1);
    }
    public int sumNumbers(TreeNode root) {
        sb = new StringBuilder();
        helper(root);
        return sum;
    }
}