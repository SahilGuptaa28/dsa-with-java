class Solution {
    public ListNode reverse(ListNode head){
        if(head == null || head.next ==null){
            return head;
        }
      ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
      return head;
    }
     public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
       ListNode middle = middleNode(head);
        ListNode second = middle.next; 
       ListNode SecondHalfStart = reverse(middle.next);
       ListNode firstHalfStart = head;
       while(SecondHalfStart != null  ){
        if(firstHalfStart.val != SecondHalfStart.val){
            return false;
        }
        firstHalfStart = firstHalfStart.next;
        SecondHalfStart = SecondHalfStart.next;

       }
       return true;
    }
}