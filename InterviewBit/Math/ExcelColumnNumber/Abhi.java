/*
	Given a title name of ExcelSheet convert that to a number
	ex : A --> 1 
		 B --> 2
		 .
		 .
		 Z --> 26
		 AA --> 27
		 AB --> 28
	Approach:
		traverse from the last character of string, multiply the corresponding character value with 26 ^ i where i = 0 to n - 1;
		return number
*/
import java.util.Scanner;

public class Abhi {
    public int titleToNumber(String A) {
        int num = 0;
        for(int i = A.length() - 1 , k = 0 ; i >= 0  ; i-- , k++){
            num = num + (int)(((int)A.charAt(i) - 64) * Math.pow(26 , k));
        }
        return num;
    }
}