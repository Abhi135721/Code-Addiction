/*
	Given a string, find the rank of the string amongst its permutations sorted lexicographically.
	Input : "acb"
	Output : 2

	The order permutations with letters 'a', 'c', and 'b' :
	abc
	acb
	bac
	bca
	cab
	cba

	Approach:
		if acb is given no of strings start with a are 2! then with b are 2! and c are 2! but before b strings, a strings must fill and before c, a & b will
		get the rank of character in string and find subsequent ranks of substrings
*/

import java.util.Arrays;
import java.util.Scanner;

public class Abhi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    // x will contain the rank of string in all possible strings formed by permutations of its
    // characters
    int x = findRank(st);
  }

  // rank of a character in string, nothing but index of that character in sorted string
  public static int min_rank(char c, String s) {
    char tempArray[] = s.toCharArray();
    Arrays.sort(tempArray);
    s = new String(tempArray);
    if (s.length() == 1) return 1;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        return i;
      }
    }
    return 1;
  }
  // finding factorial of a number, inorder to find no of strings starting with some character
  public static int fact(int n) {
    if (n == 1 || n == 0) return 1;
    else return (((n % 1000003) * (fact(n - 1) % 1000003)) % 1000003);
  }

  public int findRank(String A) {
    int rank = 0;
    if (A.length() == 0) return rank;
    // recursively calling ranks of substring
    rank =
        ((((min_rank(A.charAt(0), A) % 1000003) * (fact(A.length() - 1) % 1000003)) % 1000003)
                    % 1000003
                + (findRank(A.substring(1, A.length()))) % 1000003)
            % 1000003;
    return rank;
  }
}
