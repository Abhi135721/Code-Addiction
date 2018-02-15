/*
	Given an array find if a number exists such that the no. of elements greater than that number is equal to the number
	Ex :- 1 2 3 4
	for 2 : 3 and 4 are greater than 2 i.e., 2 elements greater than 2
	Approach:
		Sorting the array will help us
		Since elements are sorted , compare number and (length - index - 1) i.e., no of elements after that number
		Edge cases:
			If all the elements after that number is equal to that number(forgot to check this)
			then compare two consecutive elements too

			if last element is 0 return 1
*/

import java.util.Arrays;
import java.util.Scanner;

public class Abhi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }
    int x = solve(A);
  }

  public int solve(int[] A) {
    Arrays.sort(A);
    int x = 0;
    if (A[A.length - 1] == 0) return 1;
    for (int i = 0; i < A.length - 1; i++) {
      //
      if (A[i] == A.length - i - 1 && A[i] != A[i + 1]) {
        return 1;
      }
    }
    return -1;
  }
}
