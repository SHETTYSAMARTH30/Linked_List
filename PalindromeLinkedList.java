/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        
    ListNode prev=null;
    ListNode post=null;
    ListNode cur;
    cur=head;
        
        int count=0;
        
        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }
        
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        
        cur=head;
        for(int i=1; i<=count/2;i++){
            
            post=cur.next;
            cur.next=prev;
            prev=cur;
            cur=post;
        }
        
        //for odd number of elements
        if(count%2!=0){
            post=post.next;
        }
                    
        
        while(post!=null && prev!=null){
            if(prev.val!=post.val){
                return false;
            }
            prev=prev.next;
            post=post.next;
        }
return true;
        }
}
