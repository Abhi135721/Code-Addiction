/*
Question:	Given a positive integer N, print all the integers from 1 to N. But for multiples of 3 print “Fizz” instead of the number and for the multiples of 5 print “Buzz”.
			Also for number which are multiple of 3 and 5, prints “FizzBuzz”.

Approach:	creating a empty list of string
			add Strings of respective Integer based on fizz or buzz or fizzbuzz
*/

public class Solution {
  public ArrayList<String> fizzBuzz(int A) {
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 1; i <= A; i++) {
      if (i % 3 == 0 && i % 5 == 0) list.add("FizzBuzz");
      else if (i % 3 == 0 && i % 5 != 0) list.add("Fizz");
      else if (i % 3 != 0 && i % 5 == 0) list.add("Buzz");
      else list.add(Integer.toString(i));
    }
    return list;
  }
}
