// flatten binary tree to linked list using constant space
class Solution {
    public void flatten(TreeNode root) {
       TreeNode curr = root;
       while(curr != null){
        if(curr.left != null){
         TreeNode left = curr.left;
        while( left.right != null){
            left = left.right;
        }
        left.right = curr.right;
        curr.right = curr.left;
        }
          curr.left =null;
     
        curr = curr.right;
       }
    }
}

// use preorder traversal to store the nodes in a list and then connect the nodes in the list
class Solution {
    public void preorder(TreeNode node,List<TreeNode> list){
        if(node == null){
         return ;
        }
        list.add(node);
        preorder(node.left,list);
        preorder(node.right,list);
        return ;    
    }
    public void solve(TreeNode node){
         List<TreeNode> list = new ArrayList<>();
         preorder(node,list);
      for(int i=1;i<list.size();i++){
        node.right = list.get(i);
        node.left = null;
        node = node.right;
      }
    }
    public void flatten(TreeNode root) {
        solve(root);
    }
}