/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
*/
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A==null || A.next==null)
        return A;
        ListNode temp=A;
        ListNode next=A.next;
        while(next!=null && next.next!=null){
            int a=temp.val;
            temp.val=next.val;
            next.val=a;
            next=next.next.next;
            temp=temp.next.next;
        }
        if(next!=null){
            int a=temp.val;
            temp.val=next.val;
            next.val=a;
        }
        return A;
    }
}
