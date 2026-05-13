//Leetcode 116. Populating Next Right Pointers in Each Node
// tree is perfect binary tree so we can connect left child to right child and right child to next left child of next node
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