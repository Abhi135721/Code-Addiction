/*
Question:	Given an array of N integers, find the pair of integers in the array which have minimum XOR value.
			Report the minimum XOR value.

Approach:	Sort the array and update the minimum xor value of adjacent elements and update the value
*/

public class Solution {
  public int findMinXor(int[] A) {
    Arrays.sort(A);
    int min = A[0] ^ A[1];
    for (int i = 0; i < A.length - 1; i++) {
      if (min > (A[i] ^ A[i + 1])) min = A[i] ^ A[i + 1];
    }
    return min;
  }
}
