/*
	Trailing zeroes in a factorial:
		Given a number, return no of zeroes at the end of its factorial.
	Approach:
		//can find factorial and count the number of 0's at its end , but what if it is a big number.
		Zeroes are only formed by 2's and 5's in the factorial.
		So count the number of 2's and 5's in the factorial.
		Since no of 5s are lesser in combination of 2s and 5s , counting 5s is sufficient
*/

import java.util.Scanner;

public class Abhi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    // x contains no of zeroes at the end of factorial of a number.
    int x = trailingZeroes(A);
  }

  public int trailingZeroes(int A) {
    long no_of_zeroes = 0, i;
    for (i = 1; Math.pow(5, i) <= A; i++) {
      no_of_zeroes = no_of_zeroes + (long) (A / (Math.pow(5, i)));
    }
    return (int) no_of_zeroes;
  }
}
