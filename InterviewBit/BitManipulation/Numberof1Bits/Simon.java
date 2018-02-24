/*
Question:	count no of 1's in its binary form

Approach:	 convert the number to Binary string and count the 1'string
*/
public class Solution {
  public int numSetBits(long a) {
    if (a <= 0) return 0;
    String s = Long.toBinaryString(a);
    int c = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '1') c++;
    }
    return c;
  }
}
