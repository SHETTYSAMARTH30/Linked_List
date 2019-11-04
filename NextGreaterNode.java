/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class NextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {
        
        ListNode p=head;
        int count=0;
        int max=0;
        int a[]=new int[10000];
        
        while(p!=null){
            a[count]=p.val;
            p=p.next;
            count++;
        }
        
        int b[]=new int[count];
        
        for(int i=0;i<count;i++){
            max=a[i];
            b[i]=0;
            for(int j=i+1;j<count;j++){
                if(a[j]>max){
                    b[i]=a[j];
                    break;
                }
            }
            }
        return b;
        }
    }
