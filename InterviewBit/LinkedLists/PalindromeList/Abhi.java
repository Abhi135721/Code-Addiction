/*
	Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.
	List 1-->2-->1 is a palindrome.
	List 1-->2-->3 is not a palindrome.
	
	Approach:
		Traverse till the half of the list
		Reverse the second half 
		now compare both lists are equal or not
*/
 //Definition for singly-linked list.
public class ListNode {
 public int val;
 public ListNode next;
 ListNode(int x) { val = x; next = null; }
}
 
public class Abhi{
    public int lPalin(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev_slow = head;
        ListNode mid = null;
        int res = 0;
        if(head == null)
            return 1;
        if(head!= null && head.next == null)
            return 1;
        if(head != null && head.next != null){
            
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                
                prev_slow = slow;
                slow = slow.next;
                
            }
            
            if(fast != null){
                mid = slow;
                slow = slow.next;
            }
            
            
            ListNode sec_half = slow;
            prev_slow.next = null;
            sec_half = reverse(sec_half);
            
            if(compareLists(head , sec_half)){
                res = 1;
            }
            
            sec_half = reverse(sec_half);
            
            if(mid != null){
                prev_slow = mid;
                mid.next = sec_half;
            }
            else{
                prev_slow.next = sec_half;
            }
            
        }
        return res;
    }
    public ListNode reverse(ListNode sec_half){
        
        ListNode prev = null;
        ListNode current = sec_half;
        ListNode next;
        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        sec_half = prev;
        return sec_half;
    }
    
    public boolean compareLists(ListNode head1 , ListNode head2){
        ListNode t1 = head1;
        ListNode t2 = head2;
        while(t1 != null && t2 != null){
            if(t1.val == t2.val){
                t1 = t1.next;
                t2 = t2.next;
            }
            else{
                return false;
            }
        }
        if(t1 == null && t2 == null)
            return true;
            
        return false;
    }
}
