class Solution {
   class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        long max = 0;
        while(!q.isEmpty()){
            int size = q.size();
            long min = q.peek().index;
            long left = 0;
            long right = 0;
            for(int i = 0;i<size;i++){
                Pair curr = q.poll();
               long index = curr.index - min;
               if(i==0) left = index;
               if(i == size-1) right = index;
               TreeNode node = curr.node;
               if(node.left != null){
                q.offer(new Pair(node.left,2*index+1));
               } 
               if(node.right != null){
                q.offer(new Pair(node.right,2*index+2));
               }
            }
           max = Math.max(max,right-left+1);
        }
        return (int)max;
    }
}