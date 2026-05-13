class Solution {
    HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();

    public void markParent(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode newNode = q.poll();
                if (newNode.left != null) {
                    parentMap.put(newNode.left, newNode);
                    q.offer(newNode.left);
                }
                if (newNode.right != null) {
                    parentMap.put(newNode.right, newNode);
                    q.offer(newNode.right);
                }
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        markParent(root);
        HashMap<TreeNode,Boolean> visitedMap = new HashMap<>();
         Queue<TreeNode> q = new LinkedList<>();
         q.offer(target);
         int level = 0;
         visitedMap.put(target,true);
         while(!q.isEmpty()){
            int size = q.size();
            if(level == k) break;
            level++;
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(node.left != null && visitedMap.get(node.left) == null){
                    q.offer(node.left);
                    visitedMap.put(node.left,true);
                }
                if(node.right != null && visitedMap.get(node.right) == null){
                    q.offer(node.right);
                    visitedMap.put(node.right,true);
                }
                if(parentMap.get(node) != null && visitedMap.get(parentMap.get(node)) == null){
                    q.offer(parentMap.get(node));
                    visitedMap.put(parentMap.get(node),true);
                }
            }
         }
         List<Integer> list = new ArrayList<>();
         while(!q.isEmpty()){
            TreeNode node = q.poll();
            list.add(node.val);
         }
         return list;
    }
}