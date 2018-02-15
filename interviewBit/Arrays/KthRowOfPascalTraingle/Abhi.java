/*
	Problem Statement:
		Given an integer n we have to return nth row of pascal triangle
	Approach :
		The ith element of nth row is sum of (n-1)th row's ith element and (i-1)th element
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Abhi {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = generate(n);
	}
    public ArrayList<Integer> getRow(int A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        //ArrayList<Integer> a = new ArrayList<Integer>();
        for (int l = 0; l <= A; l++){
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i <= l; i++){
                
              if (l == i || i == 0)
                   a.add(1);
              else if(l > 0)
                   a.add(arr.get(l - 1).get(i - 1) + arr.get(l - 1).get(i));
            }
            arr.add(a);
        }
        return arr.get(A);
    }
}
