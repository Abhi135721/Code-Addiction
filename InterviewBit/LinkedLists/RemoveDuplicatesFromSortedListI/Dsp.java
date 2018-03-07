/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
*/

public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
         ListNode current=A;
	    while (current.next!=null) {
	        if (current.val==current.next.val) {
	            current.next=current.next.next;
	        }
	        else {
	            current=current.next;
	        }
	    }
	    return A;
	}
}
