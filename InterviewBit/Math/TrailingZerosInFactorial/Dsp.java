/*
Given an integer n, return the number of trailing zeroes in n!.
*/
/*
approach:
adding zeros from multiple of 5
*/

public class Solution {
    public int trailingZeroes(int A) {
        int count=0;
        while(A>=5){
            count+=A/5;
            A/=5;
        }
        return count;
    }
}
