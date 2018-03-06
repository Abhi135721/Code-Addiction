/*
Question:	Given a set of candidate numbers (C) and a target number (T),
			find all unique combinations in C where the candidate numbers sums to T.

Approach:	calculating all sets that produce sum of Target with the help of backtracking
*/
public class Solution {
  public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
    ArrayList<Integer> prefix = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
    Collections.sort(A);
    solve(A, B, prefix, solution);
    return solution;
  }

  public void solve(
      ArrayList<Integer> list,
      int sum,
      ArrayList<Integer> prefix,
      ArrayList<ArrayList<Integer>> solution) {
    if (sum == 0) {
      ArrayList<Integer> org = new ArrayList<Integer>(prefix);
      Collections.sort(org);
      if (!solution.contains(org)) {
        solution.add(org);
      }
    }
    if (sum < 0) {
      return;
    }
    for (int i = 0; i < list.size(); i++) {
      int n = list.get(i);
      int nsum = sum - n;
      prefix.add(n);
      solve(list, nsum, prefix, solution);
      prefix.remove(prefix.size() - 1);
    }
  }
}
