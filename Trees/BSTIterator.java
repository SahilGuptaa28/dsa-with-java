class BSTIterator {
     Stack<TreeNode> s = new Stack<>();
    public BSTIterator(TreeNode root) {
       pushAll(root);
    }
    
    public int next() {
        TreeNode node = s.pop();
        pushAll(node.right);
        return node.val;
      
    }
    
    public boolean hasNext() {
         return !s.isEmpty();
    }
    private void pushAll(TreeNode node){
        if(node == null) return;
        s.push(node);
        pushAll(node.left);
    }
}