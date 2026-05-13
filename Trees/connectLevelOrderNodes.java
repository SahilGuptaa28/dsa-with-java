// constant space solution
class Solution {
    public Node connect(Node root) {
        if (root == null)
            return null;
        Node leftmost = root;
        while (leftmost.left != null) {
            Node curr = leftmost;
            while (curr != null) {
                curr.left.next = curr.right;
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }

            leftmost = leftmost.left;
        }
        return root;
    }
}
// using queue
class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node node = q.poll();
               if(i+1 == size){
                node.next = null;
               }else{
                Node nextNode = q.peek();
                node.next = nextNode;
               }
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return root;
    }
}