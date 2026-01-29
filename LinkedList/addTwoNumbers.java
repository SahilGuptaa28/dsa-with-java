class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(a != null || b!= null || carry != 0){
            int sum = 0;
            if(a != null) {
                sum += a.val;
                a = a.next;
            }
            if(b != null){
                sum += b.val;
                b = b.next;
            }
             sum += carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);   
            curr.next =  newNode;
            curr = curr.next;
           
        }
        
         return dummy.next;
    }
}