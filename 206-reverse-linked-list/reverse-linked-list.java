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
        //iterative
        // ListNode temp=head;
        // ListNode prev = null;
        // while(temp != null)
        // {
        //     ListNode front=temp.next;
        //     temp.next=prev;
        //     prev=temp;
        //     temp=front;
        // }
        // return prev;

        //recursive
        ListNode temp=head;
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode newhead = reverseList(temp.next);
        ListNode front=temp.next;
        front.next=temp;
        temp.next=null;
        return newhead;
    }
}