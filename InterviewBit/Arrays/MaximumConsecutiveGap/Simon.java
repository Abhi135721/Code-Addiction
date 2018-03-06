/*
Question:	Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

Approach:	Sort the array and update the maximum difference
*/

public class Solution {
  // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
  public int maximumGap(final int[] A) {
    if (A.length <= 1) return 0;
    int[] B = new int[A.length];
    for (int i = 0; i < A.length; i++) B[i] = A[i];
    Arrays.sort(B);
    int maxdiff = Integer.MIN_VALUE;
    for (int j = 1; j < A.length; j++) {
      int cdiff = B[j] - B[j - 1];
      if (cdiff > maxdiff) maxdiff = cdiff;
    }
    return maxdiff;
  }
}
