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
     public ListNode mergeSort(ListNode[] lists, int low, int high) {
        if(low == high) return lists[low];
        int mid = low + (high - low) / 2;

       ListNode l1 = mergeSort(lists, low, mid);
        ListNode l2 = mergeSort(lists, mid + 1, high);
       return mergeTwoLists(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
        return null;
      }
     return mergeSort(lists, 0, lists.length-1);
    }
}

// optimal


// brute force;
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0  ){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        if(lists.length == 2){
           return mergeTwoLists(lists[0],lists[1]);
        }
        ListNode head1 = lists[0];
        ListNode head2 = lists[1];
        for(int i=2;i<lists.length;i+=2){
           head1 = mergeTwoLists(head1,lists[i]);
        }
        for(int i=3;i<lists.length;i+=2){
           head2 = mergeTwoLists(head2,lists[i]);
        }
       return mergeTwoLists(head1,head2);
    }
}