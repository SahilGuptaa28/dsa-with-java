class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
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
    public ListNode mergeSort(ListNode head){
         if(head == null || head.next == null){
        return head;
       }
        ListNode middle = middleNode(head);
        ListNode lefthead = head;
        ListNode righthead = middle.next;
        middle.next = null;
        lefthead = mergeSort(lefthead);
        righthead =  mergeSort(righthead);
        return mergeTwoLists(lefthead,righthead);
    }
    public ListNode sortList(ListNode head) {
       return mergeSort(head);
    }
}