/**
 * Definition for singly-linked list. class ListNode { public int val; public ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
  public ListNode mergeTwoLists(ListNode A, ListNode B) {
    ListNode ans = new ListNode(-1);
    ListNode temp = ans;
    ListNode h1 = A;
    ListNode h2 = B;
    while (h1 != null && h2 != null) {
      if (h1.val > h2.val) {
        temp.next = new ListNode(h2.val);
        h2 = h2.next;
      } else {
        temp.next = new ListNode(h1.val);
        h1 = h1.next;
      }
      temp = temp.next;
    }
    while (h1 != null) {
      temp.next = new ListNode(h1.val);
      h1 = h1.next;
      temp = temp.next;
    }
    while (h1 != null) {
      temp.next = new ListNode(h1.val);
      h1 = h1.next;
      temp = temp.next;
    }
  }
}
