/*
	Greatest common divisor:
		given two numbers return greatest divisor common to both
	edge cases:
		if any one of those is 0 , return the other.
		if both have no common divisor at all , return 1.
*/

import java.util.Scanner;

public class Abhi{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		//x contains gcd of a numbers
		int x = gcd(A , B);
	}
    public int gcd(int A, int B) {
        if(A == 0)
            return B;
        if(B == 0)
            return A;
        int gcd = 1;
		//start from 1, check any is common divisor to both; update the recent one
        for(int i = 1; i <= A && i <= B; ++i)
        {
            // Checks if i is factor of both integers
            if(A % i==0 && B % i==0)
                gcd = i;
        }
        return gcd;
    }
}
