/*
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:

Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
*/

public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        if(A == null || A.next == null || B == 0) {
            return A;
        }
        int len = 0;
        ListNode temp=A;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        B %= len;
        if(B == 0)
        return A;
        int newHeadIndex=len-B;
        temp=A;
        ListNode newHead = null;
        for(int i = 0; i < len; i++) {
            ListNode next = temp.next;
            if (i == newHeadIndex - 1) {
                temp.next = null;
                newHead = next;
            }
            else if(i == len -1) {
                temp.next=A;
            }
            temp = next;
        }
        return newHead;
    }
}
