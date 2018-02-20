/*
	Given a number we have to return whether a given number can be expressed as power of two integers A ^ P
	where A > 0 && P > 1
	edge case : if the given number is 1 return 1 since 1 ^ anything gives 1;
				if it is 2 it cannot be expressed as A ^ P so return 0 (false)
	Approach:
		check from 2 to sqrt(n) can be base &&  check every power possible to equal that given number.
*/

import java.util.Scanner;

public class Abhi {
  public static void main(String[] args) {
    int x;
    Scanner sc = new Scanner(System.in);
    x = isPower(sc.nextInt());
  }

  public int isPower(int A) {
    if (A == 1) return 1;
    if (A == 2) return 0;
    for (int i = 2; i <= Math.sqrt(A); i++) {
      int j = 2;

      double power = Math.pow(i, j);

      while (power <= A && power > 0) {
        if (power == A) return 1;
        j++;
        power = Math.pow(i, j);
      }
    }
    return 0;
  }
}
