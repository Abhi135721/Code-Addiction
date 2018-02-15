/*		Add one to number
	given an array of digits of a number we have to return (number + 1) back in an array
    Firstly , sounds simply like adding one to the last index's digit and return the array
		But , Edge cases are if last digit is 9 ---> it becomes 10 ,
		So , updated it with 0 and added 1 to preceding digit
		for cases like 9999 we have to increase array size by 1 to store 10000
*/

import java.util.Scanner;

public class Abhi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] A = new int[n + 1];
    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }
    A = plusOne(A);
  }

  public int[] plusOne(int[] A) {
    // checked if last index is 0 if it is 0 add one to it it will be 1 (0 + 1)
    if (A[A.length - 1] == 0) {
      A[A.length - 1] = 1;
    }
    // if it is 9 make it as 0 and add 1 to preceding digit
    else if (A[A.length - 1] == 9) {
      A[A.length - 1] = 0;
      for (int i = A.length - 2; i >= 0; i--) {
        if (A[i + 1] == 0) {
          if (A[i] == 9) {
            A[i] = 0;
          } else {
            A[i] = A[i] + 1;
            break;
          }
        }
      }
      boolean flag = true;

      for (int i = 0; i < A.length; i++) {
        if (A[i] != 0) flag = false;
      }
      // so for 9999 it will become 0000 ,still needed to increase array size add 1 to first index
      if (flag) {
        int[] B = new int[A.length + 1];
        B[0] = 1;
        for (int i = 1; i <= A.length; i++) {
          B[i] = A[i - 1];
        }
        return B;
      }
    }
    // simply adding one to last digit
    else {
      A[A.length - 1] = A[A.length - 1] + 1;
    }
    // if a number is given 00089 we just need to return 90 .... not 00090
    int count = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] != 0) {
        break;
      }
      count++;
    }
    int[] C = new int[A.length - count];
    for (int i = count; i < A.length; i++) {
      C[i - count] = A[i];
    }
    return C;
  }
}
