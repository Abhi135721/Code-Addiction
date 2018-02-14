/*
	Problem Statement:
		Given an integer n we have to return a two dimensional array (or) Array list of Lists containing n rows of pascal triangle
	Approach :
		The ith element of nth row is sum of (n-1)th row's ith element and (i-1)th element
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for (int l = 0; l < A; l++){
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i <= l; i++){
                
              if (l == i || i == 0)
                   a.add(1);
              else if(l > 0)
                   a.add(arr.get(l - 1).get(i - 1) + arr.get(l - 1).get(i));
            }
            arr.add(a);
        }
        return arr;
    }
}
