/*
A robot is located at the top-left corner of an A x B grid 
The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid.
*/

public class Solution {
    public int uniquePaths(int A, int B) {
        int[] arr= new int[B];
        Arrays.fill(arr, 1);
        for(int i=1;i<A;i++){
            for(int j=1;j<B;j++){
                arr[j]=arr[j-1]+arr[j];
            }
        }
        return arr[B-1];
    }
}
