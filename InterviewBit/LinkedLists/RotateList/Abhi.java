/*
	Given a list, rotate the list to the right by k places, where k is non-negative.
	For example:
	Given 1->2->3->4->5->NULL and k = 2,
	return 4->5->1->2->3->NULL.

	Approach:
		Traverse till kth node from last.
		Make last.next = head
		Make kth node as head
		make next prev of kth node next as null
*/

class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }
public class Abhi{
    public ListNode rotateRight(ListNode A, int B) {
        ListNode slow = A;
        ListNode fast = A;
        int len = 0;
        int count = 0;
        ListNode current = A;
        while(current != null){
            len++;
            current = current.next;
        }
        B = B % len;
        if(A != null){
            while(count < B){
                if(fast == null){
                    return null;
                }
                fast = fast.next;
                count++;
            }
            if(fast == null)
                return A;
            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
           
            fast.next = A;
            A = slow.next;
            slow.next = null;
            return A;
        }
        return null;
    }
}
