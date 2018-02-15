/*
minimum number of steps needed to go from one point to another point in an infinite grid
*/
public class Solution {
  public int coverPoints(int[] A, int[] B) {
    int min = 0;
    int minA = A[0];
    int minB = B[0];
    if (A.length == 1) return 0;
    else {
      for (int i = 1; i < A.length; i++) {
        int max = Math.abs(minA - A[i]);
        if (max < Math.abs(minB - B[i])) max = Math.abs(d - B[i]);
        min = min + max;
        minA = A[i];
        minB = B[i];
      }
    }
    return min;
  }
}
