/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveValue {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode p=head;
        ListNode prev=null;

        while(p!=null){
            if(p.equals(head) && p.val==val){
                p=p.next;
                head.next=null;
                head=p;
            }
            else{
                break;
            }
        }
        
        while(p!=null){
            
            if(p.val==val){
                prev.next=p.next;
                p.next=null;
                p=prev.next;
            }
            else{
            
                    prev=p;
                    p=p.next;
            }

        }
        
        return head;
    }
}
