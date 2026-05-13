// next pointer in each node II where tree is not perfect binary tree
// using dummy node to connect the next level nodes and tail pointer to keep track of last connected
class Solution {

    public Node connect(Node root) {

        // Empty tree
        if (root == null) return null;

        // Start from first level
        Node curr = root;

        // Traverse level by level
        while (curr != null) {

            // Dummy node helps build next level linked list
            Node dummy = new Node(0);

            // Tail always points to last connected node
            Node tail = dummy;

            // Traverse current level using next pointers
            while (curr != null) {

                // Connect left child if present
                if (curr.left != null) {
                    tail.next = curr.left;
                    tail = tail.next;
                }

                // Connect right child if present
                if (curr.right != null) {
                    tail.next = curr.right;
                    tail = tail.next;
                }

                // Move horizontally in current level
                curr = curr.next;
            }

            // Move to next level
            // dummy.next stores first node of next level
            curr = dummy.next;
        }

        return root;
    }
}