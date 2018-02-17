/*
Question:	Given a column title as appears in an Excel sheet, return its corresponding column number

Approach:	Construct a Hashmap of 26 alphabets with respective value
			Read the string char by char then multiply with 26 and respective value
			Input:	ABC
			Output:	
			intially sum=0; 
			then sum=sum*26+value(char);
			sum=0*26+value(A)=0+1-->
			sum=1*26+value(B)=26+2=28-->
			sum=28*26+value(C)=728+3=731-->
			return the sum
*/
					
public class Solution {
    public int titleToNumber(String A){
        HashMap<Character,Integer> list=new HashMap<Character,Integer>();
        list.put('A',1);list.put('J',10);list.put('S',19);
        list.put('B',2);list.put('K',11);list.put('T',20);
        list.put('C',3);list.put('L',12);list.put('U',21);
        list.put('D',4);list.put('M',13);list.put('V',22);
        list.put('E',5);list.put('N',14);list.put('W',23);
        list.put('F',6);list.put('O',15);list.put('X',24);
        list.put('G',7);list.put('P',16);list.put('Y',25);
        list.put('H',8);list.put('Q',17);list.put('Z',26);
        list.put('I',9);list.put('R',18);
        int n=A.length()-1;
        int sum =0;
        for(int i=0;i<=n;i++){
            char c=A.charAt(i);
            sum=sum*26;
            sum=sum+list.get(c);
        }
        return sum;
    }
}
