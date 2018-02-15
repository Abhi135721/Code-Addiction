/*
Question:	Find out the maximum sub-array of non negative numbers from an array.

Approach:	Find current sum until negative number then break and update it with the sum,
			Skip the negative number and start the current from zero repeat until you reach end of the array.

Edge Cases:	Use long for calculating sum to prevent overflow,
			{0,0} sum is 0 and for {0,0,0} sum is zero in this case consider {0,0,0} is more elements
*/

public class Solution {
  public ArrayList<Integer> maxset(final List<Integer> A) {
    ArrayList<Integer> output = new ArrayList<Integer>();
    ArrayList<Integer> current = new ArrayList<Integer>();
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i) >= 0) {
        while (i < A.size() && A.get(i) >= 0) {
          current.add(A.get(i));
          i++;
        }
        if (sum(output) < sum(current)) output = new ArrayList<Integer>(current);
        if (sum(output) == sum(current)) {
          if (output.size() < current.size()) output = new ArrayList<Integer>(current);
        }
        current.clear();
      }
    }
    return output;
  }

  public long sum(ArrayList<Integer> A) {
    long sum = 0;
    for (int i = 0; i < A.size(); i++) {
      sum = sum + A.get(i);
    }
    return sum;
  }
}
