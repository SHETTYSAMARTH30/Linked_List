/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class FlattenDoublyList {
    public Node flatten(Node head) {
        
        if(head == null)
            return head;
        
        //Create a dummy node and pt its next to head
        Node pseudoHead = new Node();
        pseudoHead.next = head;
        pseudoHead.val = 0;
        pseudoHead.prev = null;
        pseudoHead.child = null;
        
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(head);
        
        Node previous = pseudoHead, curr = pseudoHead;
        
        while(!stack.isEmpty()){
            
            curr = stack.pop();
            previous.next = curr;
            curr.prev = previous;
            
            //Push the next element into stack
            if(curr.next != null)
                stack.push(curr.next);
            
            //If there is child push child on top of next element, so that it is next element to be fetched
            if(curr.child != null){
                
                stack.push(curr.child);
                
                //Since we need to flatten the list, all the child nodes will be null
                //So after pushing the child we make that child as null
                curr.child = null;
            }
            
            previous = curr;
            
        }
        
        // detach the pseudo node from the result
        head.prev = null;
        
        return pseudoHead.next;
        
    }
}
