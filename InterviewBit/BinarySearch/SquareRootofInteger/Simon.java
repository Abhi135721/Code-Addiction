/*
Question:	find a sqrt of an integer without using Math.sqrt()

approach:	Use BinarySearch to find square root
			Input:
			66
			Output:
			start=1,end=66,mid=66+1/2=33
			since(33*33)>66 end=32,mid=32+1/2=16
			since(16*16)>66 end=15,mid=8
			since(8*8)<66 now start value increments and when start>end loop breaks
			and returns 8 as answer

Edgecases: In solving 2147483647 since overflow occurs
*/

public class Solution {
  public int sqrt(int x) {
    if (x == 0 || x == 1) return x;
    long start = 1, end = x, ans = 0;
    while (start <= end) {
      long mid = (start + end) / 2;
      if (mid * mid == x) return (int) mid;
      if (mid * mid < x) {
        start = mid + 1;
        ans = mid;
      } else end = mid - 1;
    }
    return (int) ans;
  }
}
