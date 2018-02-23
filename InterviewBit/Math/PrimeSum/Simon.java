/*
Question:	Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

Approach:	find the greatest prime number(p) less than the given number
			if given number - p is also a prime number return both else check the next greatest prime number
*/

public class Solution {
  public ArrayList<Integer> primesum(int A) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int a = 0;
    for (int i = A; i >= 2; i--) {
      if (isprime(i)) {
        if (isprime(A - i)) {
          a = i;
          break;
        }
      }
    }
    list.add(A - a);
    list.add(a);
    return list;
  }

  public static boolean isprime(int n) {
    if (n < 2) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    if (n == 3) return true;
    for (int i = 3; i <= Math.sqrt(n) + 2; i = i + 2) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
