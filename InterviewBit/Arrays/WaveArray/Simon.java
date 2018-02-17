/*
Question:	Given an array of integers, sort the array into a wave like array and return it,.
			a1 >= a2 <= a3 >= a4 <= a5.....
			
Approach:	Sort the array then swap two consecutive elements
			For Example:
			Input:	2,5,3,7,6,9,1,8,4,0
			Output:	0,1,2,3,4,5,6,7,8,9
					(1,0)(3,2)(5,4)(7,6)(9,8)
					return 1,0,3,2,5,4,7,6,9,8
					
Edgecases:	if the length is odd swap every thing leave the last value
*/
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A){
        Collections.sort(A);
        for(int i=1;i<A.size();i=i+2){
            int temp=A.get(i);
            A.set(i,A.get(i-1));
            A.set(i-1,temp);
        }
        return A;
    }
}
