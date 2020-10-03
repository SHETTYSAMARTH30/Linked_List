/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RotateLinkList {
    public ListNode rotateRight(ListNode head, int k) {
        
        //Base cases
        if(head == null || head.next == null)
            return head;
        
        
        //We will find the old tail
        ListNode oldTail = head;
        
        int n;
        
        for(n = 1; oldTail.next != null; n++){
            
            oldTail = oldTail.next;
        }        
        
        //We will join the tail to head and form ring
        oldTail.next = head;
        
        // find new tail : (n - k % n - 1)th node
        // and new head : (n - k % n)th node or newTail.next
        
        k = k % n;
        
        //Now we will find the new tail
        ListNode newTail = head;
        
        for(int i = 0; i < (n - k) - 1; i++){
            
            newTail = newTail.next;
        }
        
        ListNode newHead = newTail.next;
        
        //Breaking ring
        newTail.next = null;
            
        return newHead;
        
    }
}
