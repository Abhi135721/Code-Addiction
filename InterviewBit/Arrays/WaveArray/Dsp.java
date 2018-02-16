/*
Given an array of integers, sort the array into a wave like array and return it
*/
/*
approach:
we have to return it in wave form so sort the array and take pairs of numbers and interchange the pairs
*/
public class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i+=2){
            if(i+1<A.length){
            int temp=A[i];
            A[i]=A[i+1];
            A[i+1]=temp;
            }
        }
        return A;
    }
}
