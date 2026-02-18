class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        // inserting copy nodes in between;
        while (temp != null) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }
        temp = head;
        // joining the random pointer of copy nodes;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node dummy = new Node(-1);
        Node curr = dummy;
        // separating the copy and original list;
        while (temp != null) {
            Node copy = temp.next;
            temp.next = copy.next; // original node connect
            curr.next = copy;  // copy node connect
            curr = curr.next;

            temp = temp.next; 
        }
        return dummy.next;

    }
}
// solution using HashMap ;
class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
           Node copyNode = new Node(temp.val);
           map.put(temp,copyNode); 
           temp = temp.next;       
        }
        temp = head;
        while(temp != null){
          Node copy = map.get(temp);
          copy.next = map.get(temp.next);
          copy.random = map.get(temp.random);
          temp = temp.next;
        }
        return map.get(head);
    }
}
