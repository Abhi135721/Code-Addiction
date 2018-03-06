/*
Reverse bits of an 32 bit unsigned integer
*/
/*
Example:
x = 3,

          00000000000000000000000000000011
=>        11000000000000000000000000000000
return 3221225472
*/

public class Solution {
  public long reverse(long a) {
    long result = 0;
    int i = 31;
    while (a > 0) {
      result += (a % 2) * Math.pow(2, i);
      i--;
      a = a / 2;
    }
    return result;
  }
}
