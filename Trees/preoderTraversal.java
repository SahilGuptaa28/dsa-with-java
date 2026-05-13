class Solution {
    public void preorder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
         list.add(node.val);
        preorder(node.left,list);
        preorder(node.right,list);
       
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }
}
// preorder traversal using stack
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
         if(root == null) return list;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
           TreeNode node = s.pop();
           list.add(node.val);
           if(node.right != null){
                 s.push(node.right);
           }
           if(node.left != null){
                 s.push(node.left);
           }
        }
        return list;
    }
}