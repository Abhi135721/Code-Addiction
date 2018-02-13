/*
Question:	You are given a read only array of n integers from 1 to n.
			Each integer appears exactly once except A which appears twice and B which is missing.
			Return A and B.
			
Approach:	Using Bucketing
*/

public class Solution {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int[] arr = new int[A.size()];
        int n = A.size();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : A) {
            //if an integer is present in that index previously then it is repeaated number
            if (arr[i - 1] == 0) arr[i - 1] = i;
            else list.add(i);
        }
        //if anyinex is zero the that is the missing number
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) list.add(i + 1);
        }
        return list;
    }
}
