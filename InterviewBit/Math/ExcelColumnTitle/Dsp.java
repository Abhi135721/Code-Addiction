/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
Input: 27
output: AA
*/
public class Dsp {
    
public String convertToTitle(int A) {

        String X = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String st="";

        while(A>0){

            st= st + X.charAt((A-1) % 26);

            if(A%26==0)

            A=(A-1)/26;

            else

            A/=26;

        }

      String str=String.valueOf(new StringBuffer(st).reverse());

        return str;

    }
public static void main(String args[]){
String excel=titleToNumber(27);
System.out.println(excel);
}

}