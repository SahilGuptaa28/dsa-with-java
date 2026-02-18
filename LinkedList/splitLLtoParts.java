class Solution {
    public int size(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
    public ListNode getNode(ListNode head, int val){
        ListNode temp = head;
        val -= 1;
          while(temp != null && val > 0){
            temp = temp.next;
            val--;
          }
          return temp;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] lists = new ListNode[k];
        int n = size(head);
         ListNode temp = head;
          int i=0;
        if(k>n){
            while(temp != null){
                lists[i++] = temp;
             ListNode next = temp.next;
              temp.next = null;  
               temp = next;
            }
            return lists;
        }
        int nodeperList = n/k;
        int moreNode = n%k;
        int s = nodeperList;
     while(temp != null && k > 0){
     if(moreNode != 0){
          s++;
          moreNode--;
     }
       ListNode curr = getNode(temp,s);
        ListNode next = curr.next;
       curr.next = null;
       lists[i++] = temp;
       s = nodeperList;
        temp = next;
        k--;
     } 
     return lists;
    }
}