/*
	Reverse of an integer:
		Given an integer return reverse of that number
	Edge cases:
		if it exceeds the limit of an integer return 0
		Forgot to check a number is negative.
*/

import java.util.Scanner;

public class Abhi {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		//x contains reverse of a number ; 0 if reverse exceeds integer range
		int x = reverse(A);
	}
	//if it is 10 digit integer checking if the last digit can make integer within the limit
    public static int check_boundary(int n){
        int x = 2147483647 / n;
        return x;
    }
    public int reverse(int A) {
		//sign for storing negative or positive
        boolean sign = false;
        int res = 0 , count = 0;
        if(A > 0){
            sign = true;
        }
        if(!sign){
            A = -1 * A;
        }
        while(A > 0){
            count++;
			//if it is 10 digit number
            if(count == 10){
                if(check_boundary(res) < 10)
                    return 0;
            }
            res = res * 10 + A % 10;
            A = A / 10;
        }
        if(sign)
            return res;
        return -1 * res;
    }
}
