/*
Given a positive integer N, print all the integers from 1 to N. But for multiples of 3 print “Fizz” instead of the number and for the multiples of 5 print “Buzz”. Also for number which are multiple of 3 and 5, prints “FizzBuzz”.
*/
/*
N = 5
Return: [1 2 Fizz 4 Buzz]
*/
public class Dsp {
public static void main(String args[]){
String[] a=fizzBuzz(5);
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
}
    public static String[] fizzBuzz(int A) {
        String[] str=new String[A];
        for(int i=1;i<=A;i++){
            if(i%3==0 && i%5==0)
            str[i-1]="FizzBuzz";
            else if(i%3==0)
            str[i-1]="Fizz";
            else if(i%5==0)
            str[i-1]="Buzz";
            else
            str[i-1]=String.valueOf(i);
        }
        return str;
    }
}
