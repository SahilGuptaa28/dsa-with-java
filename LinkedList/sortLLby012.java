class Solution {
    public Node segregate(Node head) {
        // code here
        Node zero = new Node(-1);
        Node dummy0 = zero;
        Node one = new Node(-1);
        Node dummy1 = one;
        Node two = new Node(-1);
        Node dummy2 = two;
        Node curr = head;
        while(curr != null){
            if(curr.data == 0){
                Node newNode = new Node(0);
                zero.next = newNode;
                zero = zero.next;
            }
           else if(curr.data == 1){
                 Node newNode = new Node(1);
                one.next = newNode;
                one= one.next;
            }
            else{
                 Node newNode = new Node(2);
                two.next = newNode;
                two= two.next;
            }
            curr = curr.next;
        }
         two.next = null;
        zero.next = (dummy1.next == null)? dummy2.next : dummy1.next;
        one.next = dummy2.next;
       
        return dummy0.next;
        
    }
}