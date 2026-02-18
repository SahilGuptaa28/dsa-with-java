// optimal 
public ListNode detectCycle(ListNode head) {
    if(head == null) return null;

    ListNode slow = head;
    ListNode fast = head;

    // Step 1: Detect cycle
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            break;
        }
    }

    if(fast == null || fast.next == null){
        return null;
    }

    // Step 2: Find entry
    slow = head;

    while(slow != fast){
        slow = slow.next;
        fast = fast.next;
    }

    return slow;
}


public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,1);
            temp = temp.next;
        }
        return null;
    }
}