class Solution {
    public int size(ListNode head){
        ListNode temp = head; int size=0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
   
    public ListNode getK-1thNode(ListNode head,int k){
        ListNode temp = head;
        for(int i=0;i<k;i++){
            temp = temp.next;
        }
        return temp;
    }
    public ListNode getLastNode(ListNode head){
        ListNode temp = head;
        while(temp.next != null){
           temp = temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k<1 ){
            return head;
        } 
        int n = size(head);
        if(k%n == 0){
            return head;
        }
        k = k % n;
        ListNode temp = head;
        ListNode lastNode = getLastNode(head);
        ListNode prev = getK-1thNode(head,n-k-1);
        ListNode kthNode = prev.next;
        prev.next = null;
        lastNode.next = head;
        head = kthNode;

        return head;
    }
}