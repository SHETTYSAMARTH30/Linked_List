/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class DeleteDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null){
            return head;
        }
        
        ListNode l=head;
        ListNode r=head;
        
        l=l.next;
        
        while(l!=null){
            if(l.val==r.val){
                r.next=l.next;
                l=r.next;
            }
            else{
                r=l;
                l=l.next;
            }
        }
        
        return head;

    }
}
