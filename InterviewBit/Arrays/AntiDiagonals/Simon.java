/*
Question:	Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
			Example:
			Input:
			1 2 3
			4 5 6
			7 8 9
			Return the following :
			[
				[1],
				[2, 4],
				[3, 5, 7],
				[6, 8],
				[9]
			]

Approach:	if we observed the question carefully the sum of row index and column index of all elements in a
			diagonal is same using this advantage to solve the problem
*/

public class Solution {
  public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    // create an empty list
    for (int k = 1; k <= 2 * A.size() - 1; k++) {
      ArrayList<Integer> s = new ArrayList<Integer>();
      list.add(s);
    }
    // add elements to the i+j th row
    for (int i = 0; i < A.size(); i++) {
      for (int j = 0; j < A.size(); j++) {
        list.get(i + j).add(A.get(i).get(j));
      }
    }
    return list;
  }
}
