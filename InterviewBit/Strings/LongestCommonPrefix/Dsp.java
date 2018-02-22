/*
Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
*/

public class Solution {
  public String longestCommonPrefix(ArrayList<String> A) {
    String[] arr = new String[A.size()];
    int j = 0;
    for (String a : A) {
      arr[j] = a;
      j++;
    }
    String prefix = arr[0];

    for (int i = 1; i <= A.size() - 1; i++) prefix = commonPrefixUtil(prefix, arr[i]);

    return (prefix);
  }

  String commonPrefixUtil(String str1, String str2) {
    String result = "";
    int n1 = str1.length(), n2 = str2.length();

    // Compare str1 and str2
    for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
      if (str1.charAt(i) != str2.charAt(j)) break;
      result = result + str1.charAt(i);
    }

    return (result);
  }
}
