class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        if(n==size){
            return head.next;
        }
        curr = head;
        for(int i=1;i<size-n;i++){
         curr = curr.next;
        }
        curr.next = curr.next.next;
         return head;
    }
}

// optimal 
public ListNode removeNthFromEnd(ListNode head, int n) {

    if(head == null) return null;

    ListNode fast = head;
    ListNode slow = head;

    // Move fast n steps
    for(int i = 0; i < n; i++){
        fast = fast.next;
    }

    // If fast is null → remove head
    if(fast == null){
        return head.next;
    }

    // Move together
    while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
    }

    slow.next = slow.next.next;

    return head;
}
// same code using dummy 
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode fast = dummy;
    ListNode slow = dummy;

    // Step 1: Move fast n+1 steps
    for(int i = 0; i <= n; i++){
        fast = fast.next;
    }

    // Step 2: Move both together
    while(fast != null){
        fast = fast.next;
        slow = slow.next;
    }

    // Step 3: Remove node
    slow.next = slow.next.next;

    return dummy.next;
}