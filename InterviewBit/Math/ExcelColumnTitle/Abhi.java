/*
	Given any number convert that number as ExcelSheet column title
	for example :
			1 --> A
			2 --> B
			.
			.
			.
			26 --> AA
			27 --> AB etc

	Approach:
		given a number A - Z belongs to 1 - 26
					   AA - AZ to 27 - 52
					   BA - BZ to 53 - 78 etc
		So divide that to 26 interval and add every corresponding character at the beginning of the tittle string

*/

import java.util.Scanner;

public class Abhi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String s = convertToTitle(x);
  }

  public String convertToTitle(int A) {
    String st = "";
    String X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    while (A > 0) {
      st = X.charAt((A - 1) % 26) + st;
      A = (A - 1) / 26;
    }
    return st;
  }
}
