/*
Question:	Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using
			less than O(n) space and traversing the stream sequentially O(1) times.

Approach:   using hashset add every element to the hashset
			if the length of the hashset is unchanged then array contains duplicates elements
*/

public class Solution {
  public int repeatedNumber(final List<Integer> a) {
    HashSet<Integer> set = new HashSet<Integer>();
    for (int i : a) {
      int presize = set.size();
      set.add(i);
      int cursize = set.size();
      if (presize == cursize) return i;
    }
    return -1;
  }
}
