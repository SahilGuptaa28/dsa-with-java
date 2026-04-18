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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy =new ListNode(-1);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode curr = dummy;
        ListNode a = l1;
        ListNode b = l2;
        List<Integer> list = new ArrayList<>();
        int carry =0;
        while(a!=null){
           s1.push(a.val);
           a=a.next;
        }
        while(b!=null){
           s2.push(b.val);
           b=b.next;
        }
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            int sum = 0;
            if(!s1.isEmpty()){
                sum += s1.pop();
            }
            if(!s2.isEmpty()){
                sum += s2.pop();
            }
            sum += carry;
           carry = sum/10;
           list.add(sum % 10);
        }
        for(int i=list.size()-1;i>=0;i--){
             ListNode newNode = new ListNode(list.get(i));
              curr.next = newNode;
            curr = curr.next;
        }
        return dummy.next;
    }
}
// optimal

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;

            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();

            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;

            carry = sum / 10;
        }

        return head;
    }
}