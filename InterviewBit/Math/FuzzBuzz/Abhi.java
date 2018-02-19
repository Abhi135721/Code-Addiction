/*
	FizzBuzz
	Problem Statement:
		Given a number we have to return a String array
		String array have to consist of numbers till the given number in String format
		In addition, if number is divisible by 3 replace it with Fizz
					 if number is divisible by 5 replace it with Buzz
					 if number is divisible by 3 & 5 replace it with FizzBuzz
*/
import java.util.Scanner;

public class Abhi{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int [] A = new String[n];
		A = fizzbuzz(n);
	}
    public String[] fizzBuzz(int A) {
        // if number is less than or equal to 0 return empty array
		if(A <= 0){
            String [] B = {};
            return B;
        }
        String [] B = new String[A];
        for(int i = 1 ; i <= A ; i++){
			//checking a number is divisible by both 3 & 5
            if(i % 3 == 0 && i % 5 == 0){
                B[i - 1] = "FizzBuzz";
            }
			//checking a number is divisible by 3 
            else if(i % 3 == 0){
                B[i - 1] = "Fizz";
            }
			//checking a number is divisible by 5
            else if(i % 5 == 0){
                B[i - 1] = "Buzz";
            }
			//else insert that number itself
            else{
                B[i - 1] = "" + i;
            }
        }
        return B;
    }
}
