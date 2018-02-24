/*
Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm’s runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Given [5, 7, 7, 8, 8, 10]

and target value 8,

return [3, 4].
*/
public class Solution {
public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    int first=firstindex(a,b);
	    int last=lastindex(a,b);
	    ArrayList<Integer> ob=new ArrayList<Integer>();
	    if(last==-1 || first==-1){
	    ob.add(-1);
	    ob.add(-1);
	    }
	    else{
	    ob.add(first);
	    ob.add(last);
	    }
	    return ob;
	}
	int firstindex(List<Integer> A,int num) {
	    int start=0,end=A.size()-1;
	int steps = end - start + 1;
	    int mid;
	    int low = -1;
	    int val;
	    while (steps > 0) {
	        mid = (start + end) / 2;
	        val = A.get(mid);
	        if (num < val) {
	            end = mid - 1;
	        } else if (num > val) {
	            start = mid + 1;
	        } else {
	            low = mid;
	            end = mid - 1;
	        }
	        steps /= 2;
	    }
	    return low;
}
     int lastindex(List<Integer> A,int num) {
         int start=0,end=A.size()-1;
	int steps = end - start + 1;
	    int mid;
	    int up = end + 1;
	    int val;
	    while (steps > 0) {
	        mid = (start + end) / 2;
	        val = A.get(mid);
	        if (num < val) {
	            end = mid - 1;
	        } else if (num > val) {
	            start = mid + 1;
	        } else {
	            up = mid;
	            start = mid + 1;
	        }	        
	        steps /= 2;
	    }
	    
	    return up;
}
}
