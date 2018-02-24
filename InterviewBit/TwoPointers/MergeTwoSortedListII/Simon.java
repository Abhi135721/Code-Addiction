/*
Question:	Given two sorted integer arrays A and B, merge B into A as one sorted array.

Approach:	use one pointer which keep index of A and another pointer to keep track the index of b
			for every element of B find the index in A which matches B element and add it to the particular index
*/

public class Solution {
  public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
    int j = 0;
    for (int i = 0; i < b.size(); i++) {
      int x = b.get(i);
      while (j < a.size() && a.get(j) < x) j++;
      if (j < a.size()) a.add(j, x);
      else a.add(x);
    }
  }
}
