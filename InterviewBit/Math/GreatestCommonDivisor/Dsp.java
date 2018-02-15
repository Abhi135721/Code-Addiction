/*
GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
*/
/*
input: 3 6
output: 3
*/
public class Dsp {
  public static void main(String args[]) {
    int divisor = gcd(6, 9);
    System.out.println(divisor);
  }

  public static int gcd(int A, int B) {
    if (B == 0) return A;
    while (A != B) {
      if (A > B) A = A - B;
      else B = B - A;
    }
    return A;
  }
}
