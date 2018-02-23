/*
Question:	check if an int is palindrome or not

Approach:	reverse the given integer and check if both are equal
*/

public class Solution {
  public int isPalindrome(int A) {
    int n = 0;
    int o = A;
    while (A > 0) {
      int k = A % 10;
      A = A / 10;
      n = n * 10 + k;
    }
    if (n == o) return 1;
    else return 0;
  }
}
