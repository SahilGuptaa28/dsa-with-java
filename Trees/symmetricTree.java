// using DFS
class Solution {
    public boolean check(TreeNode node1,TreeNode node2){
        if(node1 == null || node2 == null){
            return node1 == node2;
        }
       if(node1.val != node2.val){
        return false;
       }
       return check(node1.left,node2.right) && check(node1.right,node2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
}

// using BFS
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode n1 = q.poll();
            TreeNode n2 = q.poll();

            if (n1 == null && n2 == null) continue;
            if (n1 == null || n2 == null) return false;

            if (n1.val != n2.val) return false;

            // 🔥 cross push
            q.offer(n1.left);
            q.offer(n2.right);

            q.offer(n1.right);
            q.offer(n2.left);
        }

        return true;
    }
}