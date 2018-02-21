/*
Given an array of integers, every element appears twice except for one. Find that single one.
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int result=0;
        for(int i=0;i<A.length;i++){
            result=result^A[i];
        }
        return result;
    }
}
