/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class PlusOneLinkedList {
    public ListNode plusOne(ListNode head) {
        
        ListNode sentinel=new ListNode(0);
        sentinel.next=head;
        
        ListNode rightMost=sentinel;
        
        while(head!=null){
            
            if(head.val!=9)
                rightMost=head;
            head=head.next;
        }
        
        rightMost.val+=1;
        rightMost=rightMost.next;
        
        while(rightMost!=null){
            rightMost.val=0;
            rightMost=rightMost.next;
        }
        
        return sentinel.val==0?sentinel.next:sentinel;
        
    }
}
