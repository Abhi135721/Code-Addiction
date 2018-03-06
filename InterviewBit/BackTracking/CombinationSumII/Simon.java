/*
Question:	Given a collection of candidate numbers (C) and a target number (T),
			find all unique combinations in C where the candidate numbers sums to T.
			Each number in C may only be used once in the combination.

Approach:	calculating all cominations to produce the target sum using backtracking
*/
public class Solution {
  public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
    ArrayList<Integer> prefix = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();

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
    ArrayList<Integer> set2 = new ArrayList<Integer>(list);
    for (int i = 0; i < list.size(); i++) {
      int n = list.get(i);
      int nsum = sum - n;
      prefix.add(n);
      set2.remove(i);
      solve(set2, nsum, prefix, solution);
      prefix.remove(prefix.size() - 1);
      set2.add(i, n);
    }
  }
}
