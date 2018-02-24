/*
Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".
*/
public class Solution {
	public String reverseWords(String a) {
	    String[] st=a.split(" ");
	    String ans="";
	    for(int i=st.length-1;i>=0;i--){
	        ans=ans+st[i];
	        if(i!=0)
	        ans=ans+" ";
	    }
	    return ans;
	}
}
