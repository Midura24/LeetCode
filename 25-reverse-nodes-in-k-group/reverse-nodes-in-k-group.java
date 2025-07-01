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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null)
        {
            ListNode knode=kthNode(temp,k);
            if(knode==null)
            {
                prevNode.next=temp;
                break;
            }
            ListNode nextnode=knode.next;
            knode.next=null;
            reverse(temp);
            if(temp==head)
            {
                head=knode;
            }
            else
            {
                prevNode.next=knode;
            }
            prevNode=temp;
            temp=nextnode;
        }
        return head;
    }

    ListNode kthNode(ListNode temp, int k)
    {
        k -= 1;
        while(temp!=null && k>0)
        {
            k--;
            temp=temp.next;
        }
        return temp;
    }

    ListNode reverse(ListNode temp)
    {
        if(temp==null || temp.next==null)
        {
            return temp;
        }
        ListNode newhead=reverse(temp.next);
        ListNode front=temp.next;
        front.next=temp;
        temp.next=null;
        return newhead;
    }
    
}