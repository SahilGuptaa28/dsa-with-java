
public class LL {
    Node head;
    private int size;
    LL(){
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add in first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add in last
    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
     // Delete first
     public void deleteFirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;  
     }
     // Delete last
     public void deleteLast(){
        if(head == null){
             System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;

     }

    public void printList() {
        if (head == null) {
            System.out.println(" list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    // size 
    public int size(){
         return size;
    }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update;
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("sahil"); 
        list.addLast("Gupta");
        list.addFirst("Mr.");
        list.printList();
        list.deleteFirst();
         list.printList();
         System.out.println(list.size());
         list.reverseIterate();
         list.printList();
    }
}
 ///// leetcode
class MyLinkedList {
    Node head;
     private int size;
    public MyLinkedList() {
                head = null;
                 size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int get(int index) {
         if (index < 0 || index >= size) return -1;
        Node curr = head;
        int i = 0;
        while (curr != null && i < index) {
            i++;
            curr = curr.next;
        }
        return (curr == null) ? -1 : curr.data;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            size++;
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if (index < 0 || index > size) return;
        if (index == 0) {
        addAtHead(val);
        return;
    }
    if(index == size){
        addAtTail(val);
        return;
    }
        Node curr = head;
        int i = 0;
        while (i < index - 1) {
            curr = curr.next;
            i++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index >= size) return;
        if(index == 0){
            head = head.next;
        }else{
             Node curr = head;
            for(int i=0;i<index-1;i++){
               curr = curr.next;
            }
            curr.next = curr.next.next;
        }
          size--;

    }
}
