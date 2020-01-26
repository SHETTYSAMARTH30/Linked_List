/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveAllElements {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode sentinel=new ListNode(0);
        sentinel.next=head;
        
        ListNode prev=sentinel;
        ListNode curr=head;
        
        while(curr!=null){
            
            if(curr.val!=val)
                prev=curr;
            
            else prev.next=curr.next;
            
            curr=curr.next;
            
        }
        
        return sentinel.next;
    }
}
