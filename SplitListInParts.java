/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class SplitListInParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        
        ListNode p=root;
        int count=0;
        ListNode q=null;
        ListNode r=null;
        
        while(p!=null){
            p=p.next;
            count++;
        }
        
        ListNode l[]=new ListNode[k];
        p=root;
        
        if(count<k){
            int i;
            for(i=0;i<count;i++){
                l[i]=new ListNode(p.val);
                p=p.next;
            }
            while(i!=k){
                l[i]=null;
                i++;
            }
        
        }
        else{
            int width=0;
            int index=0;
            int part=k;
            while(index!=k){
                
                if(count%part==0){
                    width=(count/part);
                }
                else{
                    width=(count/part)+1;
                }
                q=new ListNode(p.val);
                r=q;
                for(int j=1;j<width;j++){
                    p=p.next;
                    q.next=new ListNode(p.val);
                    q=q.next;
                }
                p=p.next;
                q.next=null;
                l[index]=r;
                part--;
                index++;
                count=count-width;
            }
            
            
            
        }
    

        return l;
        
    }
}
