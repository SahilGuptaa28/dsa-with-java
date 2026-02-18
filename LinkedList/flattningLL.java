class Solution {
    public Node mergeTwoLists(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(list1 != null && list2 != null){
            if(list1.data <= list2.data){
                curr.bottom = list1;
                curr = curr.bottom;
                list1 = list1.bottom;
            }else{
                 curr.bottom = list2;
                curr = curr.bottom;
                list2 = list2.bottom;
            }
            curr.next = null;
        }
        curr.bottom = (list1 != null)? list1 : list2;
       
        return dummy.bottom;
    }
// recursively merge two lists vertically;
    public Node flatten(Node root) {     
    if(root == null || root.next == null){
        return root;
    }  
    Node mergedHead = flatten(root.next);
    return mergeTwoLists(root,mergedHead);
    
    }
}