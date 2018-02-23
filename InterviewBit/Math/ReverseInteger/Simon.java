/*
Question:	Reverse the digits of a given integer

Edge cases:	If reverse is greater than Integer Maxvalue
*/

public class Solution {
  public int reverse(int A) {
    int flag = 1;
    int c = 0;
    if (A < 0) flag = -1;
    A = Math.abs(A);
    int B = A % 10;
    A = A / 10;
    while (A > 0) {
      if (c == 8) {
        if ((Integer.MAX_VALUE / B) < A * 10) return 0;
      }
      c++;
      B = (B * 10) + (A % 10);
      A = A / 10;
    }
    return B * flag;
  }
}
