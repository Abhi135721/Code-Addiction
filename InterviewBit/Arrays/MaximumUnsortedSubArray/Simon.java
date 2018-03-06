/*
Question:	Find the maximum part to be sorted to make the entire array in sorted form

Approach:	Create a duplicate array and sort that and find the start and ending point of unsorted array
*/

public class Solution {
  public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
    int start = -1, end = -1;
    ArrayList<Integer> output = new ArrayList<Integer>();
    ArrayList<Integer> B = new ArrayList<Integer>(A);
    Collections.sort(A);
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i) != B.get(i)) {
        start = i;
        break;
      }
    }
    for (int j = A.size() - 1; j >= 0; j--) {
      if (A.get(j) != B.get(j)) {
        end = j;
        break;
      }
    }
    if (start == -1 && end == -1) output.add(-1);
    else {
      output.add(start);
      output.add(end);
    }
    return output;
  }
}
