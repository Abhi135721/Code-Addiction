/*
	Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
	ex : 1 4 0 3 2 converts to 4 2 1 3 0
		 4 5 3 0 1 2 converts to 1 2 0 4 5 3
	Approach:
		Sice we have to do it with O(1) space complexity ,we need to try to formulate this;
		A[i] = A[i] + ( A[A[i]] % n ) * n ;
		finally A[i] = A[i] / n;
*/
public class Abhi {
  public void arrange(ArrayList<Integer> a) {
    for (int i = 0; i < a.size(); i++) {
      a.set(i, a.get(i) + ((a.get(a.get(i)) % a.size()) * a.size()));
    }
    for (int i = 0; i < a.size(); i++) {
      a.set(i, a.get(i) / a.size());
    }
  }
}
