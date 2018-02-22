/*
Given an array of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.
*/

public class Solution {
  public int findMinXor(int[] A) {
    int min = 9999;
    Arrays.sort(A);
    for (int i = 0; i < A.length - 1; i++) {
      int b = A[i] ^ A[i + 1];
      if (min > b) min = b;
    }
    return min;
  }
}
