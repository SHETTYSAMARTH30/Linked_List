/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class FindIntersectionList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
      ListNode p=headA;
      ListNode q=headB;
        
        while(p!=q){
            p=(p!=null)?p.next:headB;
            q=(q!=null)?q.next:headA;
        }
        return p;
    }
}
