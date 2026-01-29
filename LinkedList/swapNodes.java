class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode prev1 = head;
        ListNode prev2 = head;
        int size = 0;
        if(head == null || head.next == null){
            return head;
        }
        while(prev1 != null){
           size++;
           prev1 = prev1.next;
        }
        prev1 = head;
        for(int i=1;i<k;i++){
            prev1 = prev1.next;
        }
        for(int i=1;i<=size-k;i++){
            prev2 = prev2.next;
        }
         int temp = prev1.val;
         prev1.val = prev2.val ;
         prev2.val = temp;
      return head;
    }
}