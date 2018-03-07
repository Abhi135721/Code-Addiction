/*
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
*/

public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode temp=new ListNode(0);
        temp.next=A;
        ListNode prev=temp,curr=A;
        while(curr!=null)
        {
            while(curr.next!=null && (prev.next.val==curr.next.val))
                curr=curr.next;
            if(prev.next==curr)
                prev=prev.next;
            else
                prev.next=curr.next;
            curr=curr.next;
       }
        return temp.next;
    }
}
