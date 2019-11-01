/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return null;
        }
        
        if(head.next==null){
            return head;
        }
    
        ListNode prev=null;
        ListNode post=null;
        
        while(head!=null){
            post=head.next;
            head.next=prev;
            prev=head;
            head=post;
            
        }
         
        return prev;
        
    }
    
}
