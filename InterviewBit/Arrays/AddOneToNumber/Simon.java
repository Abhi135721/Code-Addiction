/*
Question: Add 1 to the number

Approach: Remove all paded zeros ,add 1 to the end of the array list
          and store result in another array list until carry is not generated
          and then at the end reverse the new arraylist and return that
		  Example: Input Given list is {1,2,3,9,9}
				   Output :
				   1,2,3,9,(9+1)-->carry is 1 & answer list is {0}
				   1,2,3,(9+1)-->carry is 1 & answer list is {0,0}
				   1,2,(3+1)-->carry is 0 & answer list is {0,0,4}
				   1,(2+0)-->carry is 0 & answer list is {0,0,4,2}
				   (1+0)-->carry is 1 & answer list is {0,0,4,2,1}
				   Now reverse the list and send output as {1,2,4,0,0}

Edge cases: paded zeroes at the front,
            input contains all 9's
*/

public class Solution {
  public ArrayList<Integer> plusOne(ArrayList<Integer> Input) {
    int carry = 0, flag = 0;
    ArrayList<Integer> output = new ArrayList<Integer>();
    if (Input.size() == 0) return output;
    ArrayList<Integer> A = new ArrayList<Integer>();
    for (int index = 0; index < Input.size(); index++) {
      if (Input.get(index) == 0 && flag == 0) {
        // creating a Arraylist without padded zeros in begining until a non zero number is found
      } else A.add(Input.get(index));
      if (Input.get(index) != 0) flag = 1;
      // if flag is 1 then non zero number is started then stop removing zeros
    }
    // if input consists of all zeros our modified array size becomes zero
    if (A.size() == 0) {
      output.add(1);
      return output;
    }
    for (int i = A.size() - 1; i >= 0; i--) {
      if (i == A.size() - 1) carry = 1;
      int x = A.get(i);
      if (carry == 1) {
        if (x == 9) {
          output.add(0);
          carry = 1;
        } else {
          output.add(x + 1);
          carry = 0;
        }
      } else output.add(x);
    }
    // if array is 9,9,9,9 our output is 0,0,0,0 so add 1 in the end now reverse list
    if (carry == 1) output.add(1);
    Collections.reverse(output);
    return output;
  }
}
