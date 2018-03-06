/*
	Given a sorted linked list, delete all duplicates such that each element appear only once.
	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
	
	Approach:
		traverse through the list.
		If current value and current.next value is equal remove next element to current
*/
 //Definition for singly-linked list.
 class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }
 
public class Abhi{
    public ListNode deleteDuplicates(ListNode A) {
        ListNode current = A;
        ListNode next_next;
        
        if(A == null)
            return null;
        
        while(current.next != null){
            if(current.val == current.next.val){
                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
            }
            else{
                current = current.next;
            }
        }
        return A;
    }
}
