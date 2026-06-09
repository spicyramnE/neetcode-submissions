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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy= new ListNode(0);
       dummy.next=head;

       ListNode lead=dummy;
       ListNode trail=dummy;
     for (int i = 0; i <= n; i++) {
            lead = lead.next;
        }
      

    while(lead!=null){
        lead=lead.next;
        trail=trail.next;
    }
    trail.next=trail.next.next;
    return dummy.next;
}}
