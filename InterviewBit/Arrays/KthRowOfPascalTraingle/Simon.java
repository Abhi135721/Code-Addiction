/*
Question:	Print the Kth row of Pascal triangle

Approach:	Intially List was 0,1,0 then iterating the array by adding 2 elements to obtain kth row
			Example: 
					(0,1,0) -->
					(0,0+1,1+0,0) = (0,1,1,0) -->
					(0,0+1,1+1,1+0,0) = (0,1,2,1,0) -->
					(0,0+1,1+2,2+1,1+0,0) = (0,1,3,3,1,0) --->so on
					
Edge cases:	Before returning solution remove starting 0 and ending 0 from list
*/

public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer>solution =new  ArrayList<Integer>();
        if(A==0){solution.add(1);return solution;}
        ArrayList<Integer>def =new  ArrayList<Integer>();
		//Initialising array with 0,1,0
        def.add(0);def.add(1);def.add(0);
        for(int i=0;i<A;i++){
             ArrayList<Integer>cur =new  ArrayList<Integer>();
             cur.add(0);
             for(int j=0;j<def.size()-1;j++){
                 cur.add(def.get(j)+def.get(j+1));
             }
             cur.add(0);
             def=cur;
             solution=cur;
        }
        solution.remove(solution.size()-1);solution.remove(0);
        return solution;
    }
}
