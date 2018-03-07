/*
Given a linked list, remove the nth node from the end of list and return its head.

For example,
Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.
*/

public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode temp=A;int len=0;
        while(temp!=null){
         len++;
         temp=temp.next;
        }
        if(A==null)
        return A;
        if(B>=len)
        return A.next;
        temp=A;
         int remove=len+1-B;
        for(int i=1;i<remove-1;i++){
            temp=temp.next;
        }
        ListNode rm = temp.next;
	        if(rm.next==null)
	          temp.next=null;
	        else{
	            temp.next=rm.next;
	        }
	        return A;
    }
}
