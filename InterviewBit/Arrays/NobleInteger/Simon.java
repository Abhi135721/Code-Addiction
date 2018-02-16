/*
Question:	find an integer p in an array such that the number of integers greater than p in the array 
			equals to p. if possible return 1 else return -1.

Approach:	Sort the Array then check for element A[i]
			such that A[i]==length of the array minus index of it plus 1
			For Example:
			Input is {4,3,1,3,5,6,3,2} length of the array is 7
			Output: After sorting {1,2,3,3,3,4,5,6}
					Here last index of three is 4 then (7-4)=3(the number itself)
					Hence return 1
				
Edge cases:	Take care of duplicates
*/

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i]==((A.length-1)-i)){
                if(i!=A.length-1){if(A[i]==A[i+1]){i++;continue;}}
                return 1;
            }
            if(i==A.length-1){if(A[i]==0)return 1;else break;}

        }
        return -1;
    }
}
