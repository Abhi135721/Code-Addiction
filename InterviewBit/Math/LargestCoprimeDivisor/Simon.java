/*
Question:	You are given two positive numbers A and B. You need to find the maximum valued integer X such that:
			X divides A i.e. A % X = 0
			X and B are co-prime i.e. gcd(X, B) = 1

Approach:	until gcd of two numbers is 1 dividfe the number with current gcd
*/
public class Solution {
  public static int gcd(int x, int y) {
    while (x != y) {
      if (x > y) x = x - y;
      else y = y - x;
    }
    return x;
  }

  public int cpFact(int A, int B) {
    int x = A;
    int y = gcd(x, B);
    while (y != 1) {
      y = gcd(x, B);
      x = x / y;
    }
    return x;
  }
}
