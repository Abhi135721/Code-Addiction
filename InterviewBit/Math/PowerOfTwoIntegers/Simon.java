/*
Question:	Given a positive integer which fits in a 32 bit signed integer,
			find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Approach:	bruteforce for all possible values
			Make it efficient by eliminating all the unnecessary values of bases and powers
			Maximum base possible is sqrt of number
			Maximum power possible is highest power of 2
*/
public class Solution {
  public int isPower(int x) {
    if (x == 1) return 1;
    if (x <= 0) return 0;
    double y;
    for (int i = 2; i <= Math.sqrt(x) + 3; i++) {
      for (int j = 2; j <= (Math.log(x) / Math.log(2)) + 3; j++) {
        y = Math.pow(i, j);
        if (y == x) return 1;
      }
    }
    return 0;
  }
}
