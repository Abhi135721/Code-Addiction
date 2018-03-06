/*
Question:	Given numRows, generate the first numRows of Pascal’s triangle.

Approach:	generate rows of pascal triangle then add every row to solution
			Intially List was 0,1,0 then iterating the array by adding 2 elements to obtain kth row
			Example:
					(0,1,0) -->
					(0,0+1,1+0,0) = (0,1,1,0) -->
					(0,0+1,1+1,1+0,0) = (0,1,2,1,0) -->
					(0,0+1,1+2,2+1,1+0,0) = (0,1,3,3,1,0) --->so on

Edge cases:	Before returning solution remove starting 0 and ending 0 from list
*/
public class Solution {
  public ArrayList<ArrayList<Integer>> generate(int A) {
    ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> def = new ArrayList<Integer>();
    if (A == 0) {
      return solution;
    }
    // Initialising array with 0,1,0
    def.add(0);
    def.add(1);
    def.add(0);
    ArrayList<Integer> d = new ArrayList<Integer>();
    d.add(1);
    solution.add(d);
    for (int i = 0; i < A - 1; i++) {
      ArrayList<Integer> cur = new ArrayList<Integer>();
      cur.add(0);
      for (int j = 0; j < def.size() - 1; j++) {
        cur.add(def.get(j) + def.get(j + 1));
      }
      cur.add(0);
      def = cur;
      ArrayList<Integer> tem = new ArrayList<Integer>(cur);
      tem.remove(cur.size() - 1);
      tem.remove(0);
      // addung every row to solution set
      solution.add(tem);
    }
    return solution;
  }
}
