/*Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1
    
    B -> 2
Input: AA
output: 27
*/
public class Dsp {
    
public static int titleToNumber(String A) {

       int result = 0;
        
for (int i = 0; i < A.length(); i++) {

            result *= 26;
// multiply with 26 we have 26 alphabets
            result += A.charAt(i) - 'A' + 1;
/*subtracting character ascii value A ascii value and adding 1 to it A-A=0 but it is 1 */
        }

        return result;

    }
public static void main(String args[]){
int number=titleToNumber("AA");
System.out.println(number);
}

}
