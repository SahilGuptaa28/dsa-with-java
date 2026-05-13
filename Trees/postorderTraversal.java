class Solution {
    public void postorder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
        postorder(node.left,list);
        postorder(node.right,list);
        list.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root,list);
        return list;
    }
}
// postorder traversal using Two stack`
public List<Integer> postorderTraversal(TreeNode root) {

    List<Integer> list = new ArrayList<>();

    if(root == null) return list;

    Stack<TreeNode> s1 = new Stack<>();
    Stack<TreeNode> s2 = new Stack<>();

    s1.push(root);

    while(!s1.isEmpty()) {

        TreeNode node = s1.pop();

        s2.push(node);

        if(node.left != null) {
            s1.push(node.left);
        }

        if(node.right != null) {
            s1.push(node.right);
        }
    }

    while(!s2.isEmpty()) {
        list.add(s2.pop().val);
    }

    return list;
}
// postorder traversal using one stack
 public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
         if(root == null) return list;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
           TreeNode node = s.pop();
           list.add(0,node.val);
           if(node.left != null){
                 s.push(node.left);
           }
           if(node.right != null){
                 s.push(node.right);
           }
        }
        return list;
    }