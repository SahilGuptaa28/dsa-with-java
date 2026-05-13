class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return list;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            double levelSum = 0;
            double levelAvg = 0;
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
               levelSum += node.val;
               if(node.left != null){
                q.offer(node.left);
               }
               if(node.right != null){
                q.offer(node.right);
               }
            }
            levelAvg = levelSum/size ;
            list.add(levelAvg);
        }
        return list;
    }
}