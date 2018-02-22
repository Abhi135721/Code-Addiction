/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
*/

public class Solution {
  public int searchInsert(ArrayList<Integer> a, int b) {
    int n = a.size();

    int start = 0;
    int end = n - 1;
    int mid = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      if (a.get(mid) == b) return mid;
      if (a.get(mid) < b) start = mid + 1;
      else end = mid - 1;
    }
    return start;
  }
}
