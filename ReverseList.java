/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseList {
    public ListNode reverseList(ListNode head) {
        
       if(head == null)
           return head;
        
        else if(head.next==null)
            return head;
            
        ListNode p=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
    
}
