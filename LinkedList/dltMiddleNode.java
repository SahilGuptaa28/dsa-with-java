class Solution {
    
    public ListNode deleteMiddle(ListNode head) {
       int size = 0;
       ListNode curr = head;
       if(head == null || head.next == null){
        return null;
       }
       while(curr != null){
        size++;
        curr = curr.next;
       }
      
       curr = head;
       int idx = (size/2);
       for(int i=0;i<idx-1;i++){
        curr = curr.next;
       }
       curr.next = curr.next.next;

     return head;
    }
}