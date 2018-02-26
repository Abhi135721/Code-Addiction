/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

*/

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        HashSet<ArrayList<Integer>> ob=new HashSet<ArrayList<Integer>>();
        for(int i=0;i<A.size();i++){
            int j=i+1;
            int k=A.size()-1;
            while(j<k){
                int sum=A.get(i)+A.get(j)+A.get(k);
                if(sum==0){
                    ArrayList<Integer> ob1=new ArrayList<Integer>();
                    ob1.add(A.get(i));
                    ob1.add(A.get(j));
                    ob1.add(A.get(k));
                    ob.add(ob1);
                }
                if(sum<=0)
                j++;
                else
                k--;
            }
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        for(ArrayList<Integer> x:ob)
        ans.add(x);
        return ans;
    }
}
