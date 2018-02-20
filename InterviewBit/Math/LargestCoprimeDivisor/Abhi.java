/*
	Given two positive numbers A and B. Need to find the maximum valued integer X such that:
		X divides A i.e. A % X = 0
		X and B are co-prime i.e. gcd(X, B) = 1

*/

import java.util.Scanner;

public class Abhi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    // x contains largest co-prime divisor of a numbers
    int x = cpFact(A, B);
  }
  // finding GCD of two integers
  public static int gcd(int n1, int n2) {
    while (n1 != n2) {
      if (n1 > n2) n1 -= n2;
      else n2 -= n1;
    }
    return n1;
  }

  public int cpFact(int A, int B) {
    // start from A and do division till gcd of x , B becomes 1;
    int x = A;
    int y = gcd(x, B);
    while (y != 1) {
      y = gcd(x, B);
      x = x / y;
    }
    return x;
  }
}
