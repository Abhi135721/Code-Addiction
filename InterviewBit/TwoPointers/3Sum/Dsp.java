/*
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
Return the sum of the three integers.

Assume that there will only be one solution

Example: 
given array S = {-1 2 1 -4}, 
and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
*/

public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        int min=Integer.MAX_VALUE;
        int target=0;
        Collections.sort(A);
        for(int i=0;i<A.size();i++){
            int j=i+1;
            int k=A.size()-1;
            while(j<k){
                int sum=A.get(i)+A.get(j)+A.get(k);
                int diff=Math.abs(sum-B);
                if(diff==0)
                return sum;
                if(diff<min){
                min=diff;
                target=sum;
                }
                if(sum<=B)
                j++;
                else
                k--;
            }
        }
        return target;
    }
}
