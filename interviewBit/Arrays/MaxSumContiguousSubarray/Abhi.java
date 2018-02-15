/*
	Problem Statement:
		Given an array find the maximum sum of continuous elements
	Approach:
		If everything is negative in the given array return the maximum negative number possible
		Else check for the maximum positive sum possible
*/
import java.util.Scanner;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] A = new int[n];
		for(int i = 0 ; i < n ; i++){
			A[i] = sc.nextInt();
		}
		maxSubArray(A);
	}
    public int maxSubArray(final int[] A) {
        //assigning max to first number in the array
		int max =A[0]; 
        boolean flag = false;
		//checking if all are negative
        for(int i = 0 ; i  < A.length ; i++){
            if(A[i] >= 0){
                flag = true;
                break;
            }
            else{
                if(max < A[i])
                    max = A[i];
            }
        }
		//if any positive element is present
        if(flag){
            int sum = 0 ;
            max =0;
            for(int i = 0 ; i < A.length ; i++){
				//two variables max and sum : max for storing maximum sum possible 
				//and sum is for storing sum after adding each element
                if(sum + A[i] >= 0){
                    sum = sum + A[i];
                    if(max <= sum){
                        max = sum;
                    }
                }
                else{
                    sum = 0;
                }
            }
            
        }
        return max;
    }
}
