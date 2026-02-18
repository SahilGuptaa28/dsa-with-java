class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode less = dummy1;
        ListNode great = dummy2;
        while(temp != null){
            if(temp.val < x){  
                less.next = temp;
                less = less.next; 
            }else{
                great.next = temp;
                great = great.next;
            }
            temp = temp.next;   
        }
        great.next = null;
         less.next = dummy2.next;
        return dummy1.next;
    }
}