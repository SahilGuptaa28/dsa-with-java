// Hare and Tortoise method
class Solution {
    public int count(Node slow,Node fast){
        int count = 1; fast = fast.next;
        while(slow!=fast){
            count++;
            fast = fast.next;
        }
        return count;
    }
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head; Node fast = head;
        while(fast != null && fast.next != null){
             slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return count(slow,fast);
            }
           
        }
        return 0;
    }
}
// using hashMap
class Solution {
    public int lengthOfLoop(Node head) {
        // code here
         HashMap<Node,Integer> map = new HashMap<>();
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(map.containsKey(temp)){
                return count-map.get(temp);
            }
            map.put(temp,count);
            temp = temp.next;
        }
        return 0;
    }
}