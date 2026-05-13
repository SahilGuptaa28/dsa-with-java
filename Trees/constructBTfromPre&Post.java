class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    int index = 0;
    public TreeNode construct(int[] preorder,int left,int right){
        if(left>right) return null;
        TreeNode node  = new TreeNode(preorder[index++]);
           if (left == right) return node;
        int leftRoot = preorder[index];
        int idx = map.get(leftRoot);
        node.left = construct(preorder,left,idx);
        node.right = construct(preorder,idx+1,right-1);
        return node;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i=0;i<postorder.length;i++){
            map.put(postorder[i],i);
        }
        return construct(preorder,0,preorder.length-1);
    }
}