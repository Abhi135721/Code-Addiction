/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.
*/

public class Solution {
  public int isPalindrome(String a) {
    char[] arr = a.toLowerCase().toCharArray();
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      if (!((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= '0' && arr[i] <= '9'))) {
        i++;
        continue;
      }
      if (!((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= '0' && arr[j] <= '9'))) {
        j--;
        continue;
      }
      if (arr[i++] != arr[j--]) return 0;
    }
    return 1;
  }
}
