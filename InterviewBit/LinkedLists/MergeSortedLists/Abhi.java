/*
	Merge two sorted linked lists and return it as a new list. 
	The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.
	For example, given following linked lists :
	  5 -> 8 -> 20 
	  4 -> 11 -> 15
	The merged list should be :
	4 -> 5 -> 8 -> 11 -> 15 -> 20

	Approach:
		As if we were merging two arrays, we will merge LinkedLists
		check which first element is smaller and make that node new head
		Traverse through both lists till any one becomes null
		check smaller and add that to new_head's current
		After that if first is completed and elements remain in second add all in second to newList and vice-versa
*/
class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
 }
public class Abhi{
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head = null;
        if(A == null && B == null)
            return null;
        if(A == null)
            return B;
        if(B == null)
            return A;
        int aval = A.val;
        int bval = B.val;
        ListNode aCurrent = A;
        ListNode bCurrent = B;
        ListNode current;
        if(aval <= bval){
            current = aCurrent;
            aCurrent = aCurrent.next;
        }
        else{
            current = bCurrent;
            bCurrent = bCurrent.next;
        }
        
        head = current;
        while(aCurrent != null && bCurrent != null){
            aval = aCurrent.val;
            bval = bCurrent.val;
            if(aval <= bval){
                current.next = aCurrent;
                aCurrent = aCurrent.next;
                current = current.next;
            }
            else{
                current.next = bCurrent;
                bCurrent = bCurrent.next;
                current = current.next;
            }
            
            
        }
        if(aCurrent == null){
            while(bCurrent != null){
                current.next = bCurrent;
                bCurrent = bCurrent.next;
                current = current.next;
            }
        }
        if(bCurrent == null){
            while(aCurrent != null){
                current.next = aCurrent;
                aCurrent = aCurrent.next;
                current = current.next;
            }
        }
        return head;
    }
}
