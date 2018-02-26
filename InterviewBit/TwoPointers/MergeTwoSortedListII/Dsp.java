/*
Given two sorted integer arrays A and B, merge B into A as one sorted array.

If the number of elements initialized in A and B are m and n respectively, the resulting size of array A after your code is executed should be m + n

Example :

Input : 
         A : [1 5 8]
         B : [6 9]

Modified A : [1 5 6 8 9]
*/

public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	   int i=0,j=0;
        int m=a.size();
        int n=b.size();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(i<=m-1 && j<=n-1){
            int x=a.get(i);
            int y=b.get(j);
            if(x<=y){
                arr.add(x);
                i++;
            }
            else{
                arr.add(y);
                j++;
            }
            
        }
        if(i>=m-1 && j<=n-1){
            while(j<=n-1){
                
                arr.add(b.get(j));
                j++;
            }
        }
        if(j>=n-1 && i<=m-1){
            while(i<=m-1){               
                arr.add(a.get(i));
                i++;        
            }
        }
        a.clear();
       for(int o:arr)
        a.add(o);
	}
}
