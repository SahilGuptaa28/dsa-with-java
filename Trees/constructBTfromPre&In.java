// using HashMap to store the index of the elements in the inorder array and then using the index to construct the binary tree
class Solution {
      HashMap<Integer,Integer> map = new HashMap<>();
      int preIndex = 0;
      public TreeNode buildTree(int[] preorder,int left,int right){
        if(left > right) return null;
        int rootVal = preorder[preIndex++];
        int index = map.get(rootVal);
        TreeNode node = new TreeNode(rootVal);
        node.left = buildTree(preorder,left,index-1);
        node.right = buildTree(preorder,index+1,right);
        return node;
      }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        for(int i=0;i<inorder.length;i++){
           map.put(inorder[i],i); 
        }
        return buildTree(preorder,0,inorder.length-1);
    }
}

// using copy of range of array to construct the binary tree
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        int r = preorder[0];
        int index = 0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i] == r){
                index = i;
                break;
            }
        }
        TreeNode node = new TreeNode(r);
        node.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
          node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
          return node;
    }
}