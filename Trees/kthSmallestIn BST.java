// optimal solution
class Solution {
    int result = 0;
    int count = 0;
    public void inorder(TreeNode node,int k){
        if(node == null){
            return;
        }
        inorder(node.left,k);
        count++;
         if(count > k) return;
        if(count == k){
            result = node.val;
            return;
        }
        inorder(node.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return result;
    
    }
}
// using list
class Solution {
    public void inorder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list.get(k-1);
    }
}
