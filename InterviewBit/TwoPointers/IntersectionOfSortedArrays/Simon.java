/*
Question:	Return the intersection of two arrays

Approach:	Take two pointers i,j whenever A[i]==B[j] add to the new array
*/

public class Solution {
  public int[] intersect(final int[] A, final int[] B) {
    int i = 0, j = 0, m = A.length, n = B.length, c = 0, k = 0;
    // counting number of elements present in both A and B
    while (i < m && j < n) {
      if (A[i] < B[j]) i++;
      else if (B[j] < A[i]) j++;
      else {
        c++;
        j++;
        i++;
      }
    }
    i = 0;
    j = 0;
    // defining new array of length=count
    int[] arr = new int[c];
    // pushing same elements into solution array
    while (i < m && j < n) {
      if (A[i] < B[j]) i++;
      else if (B[j] < A[i]) j++;
      else {
        arr[k] = B[j];
        k++;
        j++;
        i++;
      }
    }
    return arr;
  }
}
