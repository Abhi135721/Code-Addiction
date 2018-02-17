/*
Question:	Given a positive integer, return its corresponding column title as appear in an Excel sheet

Approach:	Make an Array of Alphabets, Divide the given number with 26 and add respected alphabet of remainder
			In this way build the whole array
			Input: 731
			Output: Initially answer = ""
			-->answer=solve(731/26)+value(731%26)
			-->answer=solve(28)+C
			-->answer=solve(28/26)+value(28%26)+C
			-->answer=solve(1)+value(2)+C
			-->answer=value(1)+B+C
			-->answer=A+B+C
			-->return ABC

Edge case:	if given number is Exact multiple of 26 then
			answer=solve(A/26-1)+value(A%26)
			Array[0] is Z
			For Example: if input is 52
			then output is value((52/26)-1)+value(26%26)
			answer is value(2-1)+value(0)=A+Z=AZ
*/
public class Solution {
  static String s = "";

  public String convertToTitle(int A) {
    return Build(A);
  }

  public static String Build(int A) {
    char[] c =
        new char[] {
          'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
          'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
    if (A <= 26) return "" + c[A];
    if (A % 26 != 0) s = Build(A / 26) + Build(A % 26);
    else s = Build(A / 26 - 1) + Build(A % 26);
    return s;
  }
}
