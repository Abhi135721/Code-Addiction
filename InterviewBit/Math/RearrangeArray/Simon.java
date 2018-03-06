/*
Question:	Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

Approach:	Example:
			Input is 4,1,0,2,3 length=5
			Raise every element to the respective sum at their insex
			Now modify the given array as 4+(arr[4]%5)*5 , 1+(arr[1]%5)*5 , 0+(arr[0]%5)*5 , 2+(arr[2]%5)*5 , 3+(arr[3]%5)*5
			arr={19,20,12,1,8}
			now divide with length
			arr={3 4 2 0 1 }
*/
public class Solution {
  public void arrange(ArrayList<Integer> a) {
    int n = a.size();
    for (int i = 0; i < n; i++) {
      int t = a.get(i) + (a.get(a.get(i)) % n) * n;
      a.set(i, t);
    }
    for (int j = 0; j < n; j++) {
      int t = a.get(j) / n;
      a.set(j, t);
    }
  }
}
