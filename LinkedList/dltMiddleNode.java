//  hare and tortoise method
class Solution { 
    public ListNode deleteMiddle(ListNode head) {
       if(head == null || head.next == null){
        return null;
       }
       ListNode prev = new ListNode(-1);
      ListNode slow = head;
      ListNode fast = head;
       prev.next = slow;
     while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        prev = prev.next;
     }
     prev.next = slow.next;
     return head;
     
    }
}
// skip one step of slow;
class Solution {
    public ListNode deleteMiddle(ListNode head) {
       if(head == null || head.next == null){
        return null;
       }

      ListNode slow = head;
      ListNode fast = head;
        fast  =fast.next.next;
     while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;  
     }
     slow.next = slow.next.next;
     return head;
     
    }
}

// Brute Force
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