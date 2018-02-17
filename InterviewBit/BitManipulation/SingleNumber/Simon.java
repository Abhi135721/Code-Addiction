/*
Question:	Given an array of integers, every element appears twice except for one. Find that single one.

Approach:	Perform xor operation to every bit and return the result
			Input is {A,A,B,B,C}
			Output:
			A^A^B^B^C-->0^0^C-->C (since A^A=0)
*/
public class Solution {
  public int singleNumber(final int[] A) {
    int sum = 0;
    for (int i = 0; i < A.length; i++) sum = sum ^ A[i];
    return sum;
  }
}
