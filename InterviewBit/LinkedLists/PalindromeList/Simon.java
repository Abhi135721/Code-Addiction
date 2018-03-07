/*
Question:	Given a singly linked list, determine if its a palindrome.
			Return 1 or 0 denoting if its a palindrome or not, respectively.

Approach:	push everything into a stack and while poping check if the list is palindrome or not
*/
/**
 * Definition for singly-linked list. class ListNode { public int val; public ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
  public int lPalin(ListNode A) {
    Stack<Integer> s = new Stack<Integer>();
    ListNode t = A;
    while (t != null) {
      s.add(t.val);
      t = t.next;
    }
    while (!s.isEmpty()) {
      if (A.val == s.pop()) A = A.next;
      else return 0;
    }
    return 1;
  }
}
