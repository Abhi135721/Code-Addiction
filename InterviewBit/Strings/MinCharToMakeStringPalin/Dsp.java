/*
You are given a string. The only operation allowed is to insert characters in the beginning of the string. How many minimum characters are needed to be inserted to make the string a palindrome string

Example:
Input: ABC
Output: 2
Input: AACECAAAA
Output: 2
*/

public class Solution {
    public int solve(String A) {
        for(int i=A.length();i>0;i--){
            if(palin(A.substring(0,i))){
               return A.length()-i;
            }
        }
        return 0;
    }
    public boolean palin(String st){
        int i=0;
        int j=st.length()-1;
        while(i<=j){
            if(st.charAt(i)==st.charAt(j)){
                i++;
                j--;
            }else
                return false;
        }
        return true;
    }
}
