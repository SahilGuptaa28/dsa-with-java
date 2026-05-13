class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return result;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size ;i++){
                TreeNode node = q.poll();
                if(i+1 == size){
                    result.add(node.val);
                }
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return result;
    }
}