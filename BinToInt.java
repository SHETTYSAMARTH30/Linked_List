/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class BinToInt {

    public int getDecimalValue(ListNode head) {
        
        int num=0;
        
        while(head!=null){
            
            num=num<<1;
            num=num+head.val;
            head=head.next;
        }
        
        return num;
    }
}
