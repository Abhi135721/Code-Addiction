/* 
	Problem Statement:
	Given two arrays first array representing the rows index and next array representing column index
	find the no of steps to reach end point with min steps
	
	Approach :
	Find no of steps to move from one position to another
	simply it is the max absolute difference of either rows and columns
*/
import java.util.Scanner;
public class Abhi {
	static int c=0;
	static int d=0;
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] A = new int[n];
		for(int i = 0 ; i < n ; i++){
			A[i] = sc.nextInt();
		}
		int [] B = new int[n];
		for(int i = 0 ; i < n ; i++){
			B[i] = sc.nextInt();
		}
		coverPoints(A,B);
	}
    public int coverPoints(int[] A, int[] B) {
        int min=0;
        c=A[0];d=B[0];
        if(A.length==1)
			return 0;
        else{
            for(int i=1;i<A.length;i++){
               min = min + getmax(A[i],B[i]);
               c = A[i];
			   d = B[i];
            }
        }
        return min;
    }
    public static int getmax(int a,int b){
        int z=0,x=0,y=0;
        x=Math.abs(c-a);
        y=Math.abs(d-b);
        if(x > y)
            z = x;
        else
            z = y;
        return z;
    }
}