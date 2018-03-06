/*
Find the intersection of two sorted arrays.
OR in other words,
Given 2 sorted arrays, find all the elements which occur in both the arrays.

Example :

Input :
    A : [1 2 3 3 4 5 6]
    B : [3 3 5]

Output : [3 3 5]
*/

public class Solution {
  public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int i = 0, j = 0;
    while (i < A.size() && j < B.size()) {
      int a = A.get(i);
      int b = B.get(j);
      if (a == b) {
        arr.add(a);
        i++;
        j++;
      }
      if (a < b) {
        i++;
      }
      if (a > b) {
        j++;
      }
    }
    return arr;
  }
}
