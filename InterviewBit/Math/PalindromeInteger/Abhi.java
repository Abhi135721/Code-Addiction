/*
	Palindrome integer:
		if any non-negative integer is equal to reverse of that number itself,then it is called palindrome
		ex :- 121 , 454 , 1234321
	Approach:
		every time we get a remainder multiply it with 10 and add to reverse integer(since it decimal system).
		Now compare reverse of a number and the number.if equal,then it is a palindrome
*/

import java.util.Scanner;

public class Abhi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    // x contains whether it is palindrome or not
    int x = isPalindrome(A);
  }
  // function for finding reverse of a non-negative number
  public static int reverse(int n) {
    int r = 0;
    // finding reverse of a number
    while (n != 0) {
      r = r * 10 + n % 10;
      n = n / 10;
    }
    return r;
  }

  public int isPalindrome(int A) {
    // A negative number cannot be a palindrome
    if (A < 0) return 0;
    // if reverse of a number equals to number
    if (A == reverse(A)) {
      return 1;
    }
    return 0;
  }
}
