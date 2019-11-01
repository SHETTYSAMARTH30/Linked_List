/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        
        ListNode l3;
        ListNode l4;
        ListNode l5;
        
        if(l1.val<l2.val){
            l3=new ListNode(l1.val);
            l4=l3;
            l5=l3;
            l1=l1.next;
        }
        else{
            l3=new ListNode(l2.val);
            l4=l3;
            l5=l3;
            l2=l2.next;
        }
        
        while(l1!=null && l2!=null){
            
            if(l1.val<l2.val){
                l3=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                l3=new ListNode(l2.val);
                l2=l2.next;
            }
                l4.next=l3;
                l4=l3;
        }
        
        while(l1!=null){
            l3=new ListNode(l1.val);
            l4.next=l3;
            l4=l3;
            l1=l1.next;
        }
        while(l2!=null){
            l3=new ListNode(l2.val);
            l4.next=l3;
            l4=l3; 
            l2=l2.next;
        }
        return l5;
        
        }
}
