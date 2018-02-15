/*
Given a string, find the rank of the string amongst its permutations sorted lexicographically. 
Assume that no characters are repeated.
*/
/*
input: bcda
output: 10
*/
public class Dsp {
public static void main(String args[]){
int rank=findRank("bcda");
System.out.println(rank);
}
    public static int findRank(String A) {
        char[] ch=A.toCharArray();
        char[] main1=new char[ch.length];
        main1=ch;
        String check=String.valueOf(ch);
        java.util.Arrays.sort(main1);
        String main=String.valueOf(main1);
        int a=rank(main,check,0);
        return a%1000003;
    }
    int rank(String main,String ch_arr,int index){
        if(main.length()==1)
        return 1%1000003;
        else{
        int a=main.indexOf(String.valueOf(ch_arr.charAt(index)))%1000003;
        int sum=Math.abs(a-index)%1000003;
        return (((sum%1000003*fact(main.length()-1)%1000003)%1000003+
        (rank(removeCharAt(main,a),ch_arr.substring(1),0)))%1000003)%1000003;
        }
    }
    String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
    }
    int fact(int a){
        int f=1%1000003;
        for(int i=1;i<=a;i++)
        f=f*i%1000003;
        return f%1000003;
    }
}
