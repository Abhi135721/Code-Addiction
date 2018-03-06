/*
	Given a linked list, remove the nth node from the end of list and return its head.
	For example,
	Given linked list: 1->2->3->4->5, and n = 2.
	After removing the second node from the end, the linked list becomes 1->2->3->5.
	If n is greater than the size of the list, remove the first node of the list.

	Approach:
		Use two pointers slow and fast.
		First move fast pointer by given number of nodes
		then move slow and fast one by one till fast.next is null
		Here slow.next is nth node from last, remove it
		
		if given number is greater than size of list, remove head. 
*/
class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }
public class Abhi{
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode slow = A;
        ListNode fast = A;
        
        int count = 0;
        boolean great = false;
        if(A != null){
            while(count < B){
                if(fast == null){
                    great = true;
                    break;
                }
                fast = fast.next;
                count++;
            }
            if(fast == null || great){
                ListNode next_next = A.next;
                slow = null;
                slow = next_next;
                return slow;
            }
            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            ListNode next_next = slow.next.next;
            slow.next = null;
            slow.next = next_next;
            return A;
        }
        return null;
    }
}
