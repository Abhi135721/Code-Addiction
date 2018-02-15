/*
	Problem Statement:
		Given an array of integers, sort the array into a wave like array and return it, 
		In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
		
		ex : 1 2 3 4 :----> [2 , 1 , 4 , 3] & [4 , 1 , 3 , 2] are possible. In this case return lexicographically smaller i.e., 2 1 4 3

		observing it sort the array and shift all the even place elements to odd places and arrange remaining elements in empty spaces
		Because array is sorted the elements at 2nd , 4th , 6th places must be greater than 1st , 3rd and 5th places and so on..
		Since 1st is in between 2nd and 4th it satisfies condition a1 >= a2 <= a3
*/

import java.util.Arrays;
import java.util.Scanner;

public class Abhi{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] A = new int[n];
		for(int i = 0 ; i < n ; i++){
			A[i] = sc.nextInt();
		}
		A = wave(A);
	}
    public int[] wave(int[] A) {
		//sorting array elements
        Arrays.sort(A);
        int n = A.length;
        int [] B = new int[n];
        int i = 0 , j = 1;
		//inserting even place elements at odd places
        for(int x = 0 ; x < n && j < n ; x = x + 1){
            B[x] = A[j];
            x = x + 1;
            j = j+2;
        }
		//inserting odd place elements into remaining places
        for(int x = 1 ; x < n && i < n ; x = x+1){
            B[x] = A[i];
            x = x + 1;
            i = i+2;
        }
		//Forgot to check if it is odd number of elements last index would be empty,so place last element to last element
        if(n % 2 != 0)
        B[n - 1] = A[n - 1];
        return B;
    }
}
