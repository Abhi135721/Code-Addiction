/*
Question:	Given a sorted linked list, delete all nodes that have duplicate numbers,
			leaving only distinct numbers from the original list.

Approach:	create a temporary node add only distinct values to it
			Example:
			1-->1-->2-->2-->3-->4-->5-->5
			temp-->(skip)-->(skip)-->(skip)-->(skip)-->3-->4-->(skip)-->(skip)
			temp-->3-->4
*/
/**
 * Definition for singly-linked list. class ListNode { public int val; public ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode temp = new ListNode(0);
    temp.next = head;
    ListNode prev = temp;
    ListNode current = head;

    while (current != null) {
      while (current.next != null && prev.next.val == current.next.val) current = current.next;
      if (prev.next == current) prev = prev.next;
      else prev.next = current.next;

      current = current.next;
    }
    return temp.next;
  }
}
