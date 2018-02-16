/*
Given an array find the maximum sum of continuous elements
*/
/*
If array having all negative numbers return the maximum negative number possible else check for the maximum positive sum possible
*/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int sum=0,max=A[0];
        for(int i=0;i<A.length;i++) {
      if(A[i]>=0){
        break;
      } 
      else {
        if(max<A[i]) 
        max=A[i];
        if(i+1==A.length)
        return max;
      }
    }
        for(int i=0;i<A.length;i++){
            if(sum+A[i]>=0) 
          sum=sum+A[i];
          else
          sum=0;
          if(max<=sum) 
            max=sum;
        }
        return max;
    }
}
