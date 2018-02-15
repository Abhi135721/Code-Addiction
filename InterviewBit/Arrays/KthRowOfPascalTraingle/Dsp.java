/*
Given an integer n we have to return nth row of pascal triangle
*/

public class Solution {
  public ArrayList<ArrayList<Integer>> generate(int A) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i <= A; i++) {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      for (int j = 0; j <= i; j++) {
        if (i == j || j == 0) arr.add(1);
        else arr.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
      }
      ans.add(arr);
    }
    return ans.get(ans.size() - 1);
  }
}
