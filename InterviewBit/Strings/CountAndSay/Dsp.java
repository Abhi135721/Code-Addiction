/*
The count-and-say sequence is the sequence of integers beginning as follows:
1 is read off as one 1 or 11.
11 is read off as two 1s or 21.

21 is read off as one 2, then one 1 or 1211.
*/
public class Solution {
    public String countAndSay(int A) {
         if(A<1)
	        return "";
	    String result="1";
	    for(int i=2;i<=A;i++) {
	        int count=1;
	        StringBuilder temp=new StringBuilder("");
	        char c=result.charAt(0);
	        for(int j=1;j<result.length();j++) {
	            if(c==result.charAt(j)) {
	                count++;
	            } else {
	                temp.append(count);
	                temp.append(c);
	                c=result.charAt(j);
	                count=1;
	            }
	        }
	        temp.append(count);
	        temp.append(c);
	        result=temp.toString();
	    }
	    return result;
    }
}
