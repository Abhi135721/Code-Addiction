/*
Question:	The count-and-say sequence is the sequence of integers beginning as follows:
			1, 11, 21, 1211, 111221, ...

Approach:	Take "1" as the base case then count every character in the string to produce next string
*/
public class Solution {
  public String countAndSay(int A) {
    if (A == 0) return "";
    String s = "1";
    for (int i = 1; i < A; i++) s = generate(s);
    return s;
  }

  public static String generate(String s) {
    int co = 1;
    String str = "";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      co = 1;
      while (i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        co++;
        i++;
      }
      str = str + Integer.toString(co) + c;
    }
    return str;
  }
}
