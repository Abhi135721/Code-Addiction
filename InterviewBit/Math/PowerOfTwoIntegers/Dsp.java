/*
Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.
*/
/*
approach:
For B = 2, number of possibilities = sqrt(INT_MAX) = sqrt(2^31 - 1) < 2^16.
For B = 3, number of possibilities = INT_MAX**1/3 < 2^11
decrease the integer max value depend upon the base number
*/
public class Solution {
    public int isPower(int x) {
       if (x <= 1)
       return 1;
            for (int base=2; base<x && base<Integer.MAX_VALUE/base; base++) {
                int temp = base; 
                while (temp<=x && temp<Integer.MAX_VALUE/base) {
                    temp*=base;
                    if (temp==x) 
                    return 1;
                }
            }
            return 0;
}
}
