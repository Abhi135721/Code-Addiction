/*
Given a singly linked list and an integer K, reverses the nodes of the

list K at a time and returns modified linked list.

Example :

Given linked list 1 -> 2 -> 3 -> 4 -> 5 -> 6 and K=2,

You should return 2 -> 1 -> 4 -> 3 -> 6 -> 5
*/

public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode current = A;
		ListNode previous = null;
		ListNode next = null;
		
		int count=B;
		while(count-->0 && current!=null){
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		
		if(current!=null){
			A.next=reverseList(current, B);
		}
		
		return previous;
    }
}
