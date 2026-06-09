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

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0) return null;
        // if my lists is empty or the recieved length of list is 0 then null return

        int n=lists.length;

        // merge the lists until only 1 is left
        while(n>1){
            int i=0;
            int j=n-1;
            //merging the following pairs into i itself 
            while(i<j){
                lists[i]=mergeTwoLists(lists[i],lists[j]);
                i++;
                j--;
            }
            n=(n+1)/2;
        }
        return lists[0];
    }
    private ListNode mergeTwoLists(ListNode l1, ListNode l2){
         ListNode dummy=new ListNode(-1);
         ListNode curr=dummy;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=(l1!=null) ? l1:l2;
        return dummy.next;
    }
}
