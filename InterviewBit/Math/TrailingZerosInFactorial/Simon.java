/*
Question:	Find trailing zeroes at the end of the factorial

Aproach:	Any even number multiplied with 5 gives one trailing zero
			so calculate all factors of 5
			if the factor is 25 it has two 5's in it which produce 2 trailing zeros
			and 125 has three 5's and 625=5*5*5*5 which has four 5's which produces 4 trailing zeros
			Hence calculate all the factors of 5,5^2,5^3,5^4...until 5^n where 5^n < given number
			Example:
			1000
			5 has 1000/5=200 factors
			25 has 1000/25=40 factors
			125 has 1000/125=8 factors
			625 has 1000/625=1 factors
			we wont consider 3125 since its greater than 1000
			Hence number of trailing zeroes for 1000! is 200+40+8+1=249
*/
public class Solution {
  public int trailingZeroes(int n) {
    int count = 0;
    for (int i = 5; n / i >= 1; i = i * 5) count = count + n / i;
    return count;
  }
}
