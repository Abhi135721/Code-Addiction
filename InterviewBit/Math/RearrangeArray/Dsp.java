/*
Rearrange a given array so that Arr[i] becomes Arr[Arr[i]]
*/

public class Solution {
  public void arrange(ArrayList<Integer> a) {
    int[] arr = new int[a.size()];
    int j = 0;
    for (int ele : a) {
      arr[j] = ele;
      j++;
    }
    for (int i = 0; i < arr.length; i++) {
      a.set(i, arr[arr[i]]);
    }
  }
}
