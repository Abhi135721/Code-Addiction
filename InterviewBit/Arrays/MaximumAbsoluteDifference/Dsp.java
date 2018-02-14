/*
You are given an array of N integers, A1, A2 ,�, AN. Return maximum value of f(i, j) for all 1 = i, j = N.
f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
*/
/*
construct two arrays with values: A[i] + i and A[i] - i. Then, for above 2 cases, we find the maximum value possible. For that, we just have to store minimum and maximum values of expressions A[i] + i and A[i] - i for all i.
*/
/*
Your Input: 5 2 4 3 5 1
Expected output is 6
*/
public class Solution {

  public int maxArr(int[] A) {

    int[] b = new int[A.length];
    int min1 = 99, min2 = 99, max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

    int[] c = new int[A.length];

    for (int i = 0; i < A.length; i++) {

      b[i] = A[i] + i;

      c[i] = A[i] - i;

      if (min1 > b[i]) min1 = b[i];

      if (max1 < b[i]) max1 = b[i];

      if (min2 > c[i]) min2 = c[i];

      if (max2 < c[i]) max2 = c[i];
    }

    if (Math.abs(min1 - max1) >= Math.abs(min2 - max2)) return Math.abs(min1 - max1);
    else return Math.abs(min2 - max2);
  }
}
