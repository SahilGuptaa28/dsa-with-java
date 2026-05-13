// using deque
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            Deque<Integer> list = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(level % 2 != 0){
                      list.addFirst(node.val);
                }else{
                      list.addLast(node.val);
                }
              
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            ans.add(new ArrayList<>(list)); 
            level++;
        }
        return ans;
    }
}

// using list

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(level % 2 != 0){
                      list.add(0,node.val);
                }else{
                      list.add(node.val);
                }
              
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            ans.add(list); 
            level++;
        }
        return ans;
    }
}