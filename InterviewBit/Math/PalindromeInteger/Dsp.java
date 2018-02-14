/*
A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.
*/
/*
input: 121
output: True
*/
public class Dsp {
  public int isPalindrome(int A) {
    String st = String.valueOf(A);
    for (int i = 0; i <= st.length() / 2; i++) {
      if (st.charAt(i) != st.charAt(st.length() - 1 - i)) return 0;
    }
    return 1;
  }
}
