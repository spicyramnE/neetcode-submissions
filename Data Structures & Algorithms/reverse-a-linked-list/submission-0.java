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
    public ListNode reverseList(ListNode head) {
        ListNode prev= null; // it is important for me to define both prev and curr before i start the problem noting down how it starts with null
        ListNode curr= head; // i first reverse 1st node then traverse till i find a null

        while( curr!=null){
            ListNode next=curr.next;// save next
            curr.next=prev; //reverse link
            prev=curr;//move prev
            curr=next; // move curr
        }

        return prev; // new head
    }
}
