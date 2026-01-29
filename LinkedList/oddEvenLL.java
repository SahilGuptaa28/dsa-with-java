class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
      

        return head;
    }
}


// using extra space
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head.next;
        ListNode curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(fast != null && fast.next != null){          
            list.add(fast.val);
            fast = fast.next.next;

        }
        if(fast != null){
            list.add(fast.val);
        }
         while(slow != null && slow.next != null){          
            list.add(slow.val);
            slow = slow.next.next;
        }
        if(slow != null){
            list.add(slow.val);
        }

        for(int i=0;i<list.size();i++){
            curr.val = list.get(i);
            curr = curr.next;
        }

        return head;
    }
}