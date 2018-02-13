/*
Question:	Find the maximum sum of a subarray in a given array

Approach:	Calculate the current sum of the sub array 
			whenever the current sum is less than zero update the maximum sum
		  
Edgecases:	Input contains all negative numbers the maximum number in array
			then maximum element is the maximum sum
*/

public class Solution {
    public int maxSubArray(final List<Integer> A) {
        int max = A.get(0), cur = 0;
        for (int i : A) {
            cur = cur + i;
            if (max < cur) max = cur;
            if (cur < 0) cur = 0;
        }
        return max;
    }
}