/*
Given a set of distinct integers, S, return all possible subsets.

If S = [1,2,3], a solution is:

[
  [],
  [1],
  [1, 2],
  [1, 2, 3],
  [1, 3],
  [2],
  [2, 3],
  [3],
]
*/

public class Solution {
    ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		result.add(new ArrayList<Integer>());
		ArrayList<Integer> prefix=new ArrayList<Integer>();
		if (A.size() == 0)
			return result;
			Collections.sort(A);
        solve(prefix,A,0);
        return result;
    }
    void solve(ArrayList<Integer> prefix,ArrayList<Integer> input,int index){
            for(int i=index;i<input.size();i++){
                prefix.add(input.get(i));
                result.add(new ArrayList<Integer>(prefix));
                solve(prefix,input,i+1);
                prefix.remove(prefix.size()-1);
            }
        }
}
