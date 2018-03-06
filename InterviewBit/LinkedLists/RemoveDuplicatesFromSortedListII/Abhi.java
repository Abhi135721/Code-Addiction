/*
	Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
	For example,
	Given 1->2->3->3->4->4->5, return 1->2->5.
	Given 1->1->1->2->3, return 2->3.
	
	Approach:	
		Along with current element , We will also have a track of prev element
		At head create a dummy prev
		we will traverse till current.next is not null and prev.next value is equal to current.next value 
		
		if prev.next = current then there is no movement i.e distinct elements aside
		else prev.next = current.next;

*/
class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }
public class Abhi{
    public ListNode deleteDuplicates(ListNode A) {
        ListNode current = A;
        ListNode next_next;
        
        ListNode temp = new ListNode(0);
        
        temp.next = A;
        ListNode prev = temp;
        
        if(A == null)
            return null;
        
        while(current != null){
            while(current.next != null && prev.next.val == current.next.val){
                current = current.next;
            }
            if(prev.next == current){
                prev = prev.next;
            }
            else{
                prev.next = current.next;
            }
            current = current.next;
        }
        A = temp.next;
        return A;
    }
}
