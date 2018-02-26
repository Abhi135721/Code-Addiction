/*
Write a function that takes an unsigned integer and returns the number of 1 bits it has.
*/
/*
The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.
*/

public class Solution {
  public int numSetBits(long a) {
    int ans = 0;
    while (a > 0) {
      ans += a & 1;
      a >>= 1;
    }
    return ans;
  }
}
