/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }
       ListNode curr = slow.next;
       slow.next = null;
       ListNode second = reverseList(curr);
       ListNode first = head;
       while(second != null){
        ListNode t1 = first.next;
        ListNode t2 = second.next;

        first.next = second;
        second.next = t1;
        
        first = t1;
        second = t2;
       }

       
    }
}