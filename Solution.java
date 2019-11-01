//Find the middle of the linked list
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        int value,count=0;
        ListNode l=head;
        
         while(l!=null){
             
             count++;
             l=l.next;
         }
        l=head;
        
        value=(count/2)+1;
        
        for(int i=1;i<value;i++){
            l=l.next;
        }
        
        return l;
    }
}
