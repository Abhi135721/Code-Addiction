/*
Question:	Given an unsorted integer array, find the first missing positive integer.

Approach:	use bucketing to solve this problem
			for Example:
			Input is {1,5,3,2,2}
			Output: intially all buckets are empty
			{0,0,0,0,0} if you filled buckets with all the elements in the array
			the you will get {1,2,3,0,5}
			the bucket which is still empty is the missing number.
*/

public class Solution {
  public int firstMissingPositive(int[] A) {
    // to avoid extreme cases create bucketing array of larger size
    int[] B = new int[A.length + 5];
    for (int i : A) {
      if (i > 0 && i < B.length) B[i] = i;
    }
    for (int j = 1; j < B.length; j++) {
      if (B[j] == 0) return j;
    }
    return 1;
  }
}
