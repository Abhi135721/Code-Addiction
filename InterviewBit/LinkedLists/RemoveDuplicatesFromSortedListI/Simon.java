/*
Question:	Remove Duplicates from Sorted List

Approach:	if current node value is equal to next node value then skip the next node
			Example:
			1-->1-->2-->2-->3
			1-->(skip)-->2-->(skip)-->3
			1-->2-->3
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode cur = A;
        ListNode temp;
        if(A==null)return A;
        while(cur.next!=null){
            if(cur.val == cur.next.val)cur.next = cur.next.next;
            else cur = cur.next;
        }
        return A;
    }
}
