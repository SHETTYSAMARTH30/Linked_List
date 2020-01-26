/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MiddleLinkList {
    public ListNode middleNode(ListNode head) {
        
        ListNode t=head;
    
        while(head!=null && head.next!=null){
            t=t.next;
            head=head.next.next;
        }
        
        return t;
        
    }
}
