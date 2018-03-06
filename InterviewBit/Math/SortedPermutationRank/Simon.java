/*
Question:	Given a string, find the rank of the string amongst its permutations sorted lexicographically.
			Assume that no characters are repeated.

Approach:	Recursively calling the rank of the substrings
            Example:
			find rank of code
			in code-->Arrange in lexicographical order-->cdoe ranks are c=0;d=1,e=2,o=3;
			in ode-->Arrange in lexicographical order-->doe ranks are d=0,e=1,o=2;
			in de-->Arrange in lexicographical order-->de ranks are d=0,e=1;
			in e-->rank of e is 0;
			getrank of c*(3!)+getrank of ode;
			getrank of c*(3!)+getrank of o*(2!)+getrank of de;
			getrank of c*(3!)+getrank of o*(2!)+getrank of d*(1!)+1(since only 1 char is remaining);
			0(6)+2(2)+0(1!)+1=0+4+0+1-->RANK=5

			Example: abcdef
			0(5!)+0(4!)+0(3!)+0(2!)+0(1!)+1=1-->RANK=1

			Example: fabcde
			5(5!)+0(4!)+0(3!)+0(2!)+0(1!)+1=600+0+0+0+0+1-->RANK=601
*/
public class Solution {
  public int findRank(String A) {
    int rank = 0;
    String str = "";
    char[] c = A.toCharArray();
    Arrays.sort(c);
    for (char ch : c) str = str + ch;
    long l = A.length();
    for (int i = 0; i < A.length(); i++) {
      l--;
      rank = rank + (int) (fact(l) % 1000003 * getrank(A, i) % 1000003) % 1000003;
    }
    return (rank + 1) % 1000003;
  }

  public static int getrank(String A, int start) {
    String str = "", cur = "";
    for (int i = start; i < A.length(); i++) {
      str = str + A.charAt(i);
    }
    char[] c = str.toCharArray();
    char cc = c[0];
    Arrays.sort(c);
    for (char ch : c) cur = cur + ch;
    int n = cur.indexOf(cc);
    return n;
  }

  public static long fact(long n) {
    if (n == 1) return 1;
    else if (n == 0) return 1;
    else return ((n % 1000003) * (fact(n - 1) % 1000003)) % 1000003;
  }
}
