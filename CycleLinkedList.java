/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class CycleLinkedList {
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode> h=new HashSet<ListNode>();
        
        if(head == null){
            return false;
        }
        if(head.next==null){
            return false;
        }
        
        ListNode t=head;
        h.add(t);
        
        do{
            
            t=t.next;
            if(h.contains(t)){
                return true;
            }
            else{
                h.add(t);
            }
            
        }while(t.next!=null);
        
        return false;
    }
}
