/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class InsertCircList {
    public Node insert(Node head, int insertVal) {
        
        if(head == null){
            
            Node newNode = new Node(insertVal);
            newNode.next = newNode;
            return newNode;
        }
        
        Node prev = head;
        Node curr = head.next;
        
        boolean toInsert = false;
        
        do{
            
            //Case1: If the insert value is between 2 nodes
            if(prev.val <= insertVal && curr.val >= insertVal){
                
                toInsert = true;
            }
            //Case2: If the insert val is either after the largest node or before the smallest node
            //we reached the breaking point
            else if(prev.val > curr.val){
                
                if(insertVal >= prev.val || insertVal <= curr.val)
                    toInsert = true;
            }
            
            //If the abv 2 conditions are satisfied we insert node between prev and curr
            if(toInsert){
                
                prev.next = new Node(insertVal, curr);
                return head;
            }
            
            prev = curr;
            curr = curr.next;
            
        }while(prev != head);
        
        //Case 3:- If all the nodes are equal, in that case we traverse entire loop and reach back to head. eg [1] and insert 0
        
       prev.next = new Node(insertVal, curr);
        
        return head;
       
    }
}
