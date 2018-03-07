/**
 * Definition for singly-linked list. class ListNode { public int val; public ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
/*
Question:	Given a list, rotate the list to the right by k places, where k is non-negative.
			For example:
			Given 1->2->3->4->5->NULL and k = 2,
			return 4->5->1->2->3->NULL.

 Approach:	Break the list into 2 parts such that only k nodes are remaining
			then link part2 to part1
			List
			part1-->(break)-->part2
			part2-->(link)-->part1
*/
public class Solution {
  public ListNode rotateRight(ListNode A, int B) {
    int l = 0;
    ListNode temp = A;
    ListNode Head = A;
    while (temp != null) {
      l++;
      temp = temp.next;
    }
    if (B == l) return A;
    if (B > l) B = B % l;
    if (B == 0) return A;
    temp = A;
    for (int i = 0; i < l - B - 1; i++) {
      temp = temp.next;
    }
    Head = temp.next;
    ListNode t = A;
    for (int i = 0; i < l - B - 1; i++) {
      t = t.next;
    }
    t.next = null;
    temp = Head;
    while (temp.next != null) temp = temp.next;
    temp.next = A;
    return Head;
  }
}
