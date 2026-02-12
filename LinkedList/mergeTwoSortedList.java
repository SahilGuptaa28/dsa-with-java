class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode a = list1;
        ListNode b = list2;
        while(a!=null && b != null){
           if(a.val > b.val){
            curr.next = b;
            b = b.next;
           }else{
            curr.next = a;
            a = a.next;
           }
           curr = curr.next;
        }
       curr.next = (a != null) ? a : b; 
        return dummy.next;
    }
}