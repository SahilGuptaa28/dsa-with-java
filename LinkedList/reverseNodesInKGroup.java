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
    public ListNode getkthNode(ListNode temp,int k){
        k -= 1;
        while(temp != null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
       ListNode prevNode = null;
        while(temp != null){
          ListNode kthNode = getkthNode(temp,k);
           if(kthNode == null){
            if(prevNode != null){
                prevNode.next = temp;
                break;
            }
           }
          ListNode nextNode = kthNode.next;
           kthNode.next = null;
           reverseList(temp);
           if(temp == head){
            head = kthNode;
           }else{
            prevNode.next = kthNode;
           }
           prevNode = temp;
           temp = nextNode;
           
        }
        return head;
     
    }
}