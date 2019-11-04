/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode p=head;
        int v=0;
        int count=0;
        
        
        while(p!=null){
            p=p.next;
            count++;
        }
        
        int a[]=new int[count];
        
        p=head;
        for(int i=0;i<count;i++){
            v=(i+k)%count;
            a[v]=p.val;
            p=p.next;
        }

        p=head;
        for(int i=0;i<count;i++){
            p.val=a[i];
            p=p.next;
        }
        return head;
    }
}
