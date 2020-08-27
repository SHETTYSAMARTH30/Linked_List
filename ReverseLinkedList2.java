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
class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        // Empty list
        if(head == null)
            return null;
        
        ListNode prev = null;
        ListNode curr = head;
        
        // Move the two pointers until they reach the proper starting point
        // in the list.
        while(m > 1){
            
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }
        
        // The two pointers that will fix the final connections.
        ListNode con = prev;
        ListNode tail = curr;
        
        ListNode next = null;
        
        // Iteratively reverse the nodes until n becomes 0.
        while(n > 0){
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            n--;
        }
        
        // Adjust the final connections as explained in the algorithm
        if(con != null){
            
            con.next = prev;
        }
        else{
            //If m is first node
            head = prev;
        }
        
        tail.next = curr;
        
        return head;
    }
}
