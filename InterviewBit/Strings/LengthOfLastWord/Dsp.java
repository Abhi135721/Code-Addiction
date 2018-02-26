/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0
*/
/*
Given s = "Hello World",

return 5 as length("World") = 5.
*/

public class Solution {
  public int lengthOfLastWord(final String A) {
    String[] st = A.split(" ");
    if (st.length == 0) return 0;
    return st[st.length - 1].length();
  }
}
