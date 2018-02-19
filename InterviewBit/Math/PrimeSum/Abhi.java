/*
	Prime sum
	Problem Statement : 
		Given a number represent it as sum of two prime numbers
		Ex :- 4 = 2 + 2 ; 28 = 5 + 23 etc
	Approach:
		Loop till half of the number and check (prime numbers) less than that and (number - prime number) sums up to the given number
		If yes return those two numbers
*/

import java.util.Scanner;

public class Abhi {
	public static void main(String [] args){
		int [] A = new int[2];
		Scanner sc = new Scanner(System.in);
		A = primesum(sc.nextInt());
	}
	//to check a given number is prime or not
    public static boolean isPrime(int n){
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public int[] primesum(int A) {
        int [] B = new int[2];
        for(int i = 2 ; i <= A / 2 ; i++){
            //check if both i and A - i are prime or not
            if(isPrime(i) && isPrime( A - i)){
                B[0] = i;
                B[1] = A - i;
                break;
            }
        }
        return B;
    }
}
