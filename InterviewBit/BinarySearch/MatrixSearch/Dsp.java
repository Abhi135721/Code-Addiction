/*
Write an efficient algorithm that searches for a value in an m x n matrix.
*/
/*
[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return 1 ( 1 corresponds to true )
*/
/*
approach:
first find the row of the target that we assume the target is present
*/

public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    for(ArrayList<Integer> ob:a){
	        if(ob.get(0)<=b && ob.get(ob.size()-1)>=b){
	        int low=0;int high=ob.size()-1;
	        while(low<=high)
	        {
	        int mid=(low+high)/2;
	        int x=ob.get(mid);
	        if(x>b)
	        high=mid-1;
	        else if(x<b)
	        low=mid+1;
	        else if(x==b)
	        return 1;
	        }
	    }
	}
	    return 0;
	}
}
