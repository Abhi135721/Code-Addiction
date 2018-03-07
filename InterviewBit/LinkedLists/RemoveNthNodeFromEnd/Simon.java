/*
Question:	Given a linked list, remove the nth node from the end of list and return its head.

Apprpoach:	Iterate till n-1 node and skip (n-1).next
*/
/**
 * Definition for singly-linked list. class ListNode { public int val; public ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
  public ListNode removeNthFromEnd(ListNode A, int B) {
    ListNode temp = A;
    int l = 0;
    while (temp != null) {
      l++;
      temp = temp.next;
    }
    if (B > l) {
      temp = A;
      for (int i = 1; i < l - 1; i++) temp = temp.next;
      temp.next = null;
      return A;
    }
    temp = A;
    if (B == l) return A.next;
    for (int j = 0; j < l; j++) {
      if (j == l - B - 1) temp.next = temp.next.next;
      else temp = temp.next;
    }
    return A;
  }
}
