/*
Implement pow(x, n) % d.

In other words, given x, n and d,

find (xn % d)

Note that remainders on division cannot be negative. 
In other words, make sure the answer you return is non negative.
*/
/*
Input : x = 2, n = 3, d = 3
Output : 2

2^3 % 3 = 8 % 3 = 2.
*/
public class Solution {
int pow(int a, int b, int p) {
        if (a == 0) return 0;
        if (b == 0) return 1;
 
        long[] powers = GenerateModularPowerArray(a, b, p);
             long result = 1;
        while (b > 0) {
            int pow, n;
      for (pow = 0, n = 1; n <= (b / 2); n *= 2, pow++) ;
            result = ModularMultiplication(result, powers[pow], p);
            b -= n;
        }
        return (int)((result + p) % p);
    }
    public static long ModularMultiplication(long a, long b, long p) {
        return ((a % p) * (b % p)) % p;
    }
    public static long[] GenerateModularPowerArray(int a, int b, int p) {
        int maxpower = (int) (Math.log(b) / Math.log(2));
        long[] A = new long[maxpower + 5]; 
        A[0] = (a % p);
        for (int i = 1; i <= maxpower; i++) {
            A[i] = ModularMultiplication(A[i - 1], A[i - 1], p);
        }
        return A;
    }
}
