/*
Question:	find gcd of two numbers

Approach:	finding gcd of two numbers Using recursion
            Input: if given numbers are a=625,b=125
			since a>b gcd(625-125,125)
			gcd(500,125)
			gcd(375,125)
			gcd(250,125)
			gcd(125,125)
			hence gcd is 125

Edge cases: both a and b is 0 or either a or b is 0.
*/

public class Solution {
  public int gcd(int a, int b) {
    if (a == 0 && b == 0) return 0;
    if (a == 0 && b != 0) return b;
    if (a != 0 && b == 0) return a;
    if (a == b) return a;
    if (a > b) return gcd(a - b, b);
    else return gcd(a, b - a);
  }
}
