/*
strstr - locate a substring ( needle ) in a string ( haystack ).

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/
/*
 */
public class Solution {
  public int strStr(final String A, final String B) {
    if (A.length() == 0 || B.length() == 0) return -1;
    for (int i = 0; i <= A.length() - B.length(); i++) {
      int k = 0;
      while (k < B.length() && A.charAt(i + k) == B.charAt(k)) {
        k++;
      }
      if (k == B.length()) return i;
    }
    return -1;
  }
}
