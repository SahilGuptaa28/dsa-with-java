class Solution {
    public void inorder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
        inorder(node.left,list);
         list.add(node.val);
        inorder(node.right,list);
       
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
}
// inorder traversal using stack
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
         if(root == null) return list;
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !s.isEmpty()){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }
}